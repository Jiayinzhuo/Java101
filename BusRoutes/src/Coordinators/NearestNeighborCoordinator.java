package Coordinators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Simulation.Bus;
import Simulation.BusCoordinator;
import Simulation.Passenger;
import Simulation.Station;

/**
 * This coordinator uses nearest neighbor strategy to solve this bus routing
 * problem similar to solve Traveling Salesman Problem.
 */
public class NearestNeighborCoordinator extends BusCoordinator {
	// We only build this routeTable once at the beginning using static variable
	private static ArrayList<Station>[] routeTable;
	private boolean initiated = false;

	// For each bus, there is a route table using nearest neighbor strategy
	@SuppressWarnings("unchecked")
	private void buildBusRouteTable() {
		ArrayList<Bus> buses = (ArrayList<Bus>) this.getBusses();
		routeTable = (ArrayList<Station>[]) new ArrayList[buses.size()];
		ArrayList<Station> allStations = (ArrayList<Station>) this.getStations();
		ArrayList<Station> shortestRouteStations = new ArrayList<Station>(allStations.size());

		for (int i = 0; i < buses.size(); i++) {
			//System.out.println("\n-------Bus " + i + "---------------------------------------------------");
			//System.out.println("Initial Route	==> " + Arrays.toString(allStations.toArray()));
			//System.out.println("---------------------------------------------------------------");

			Station station = buses.get(i).getStation();

			updateRoutes(shortestRouteStations, allStations, station);
			while (allStations.size() >= 1) {
				station = getNextStation(allStations, station);
				updateRoutes(shortestRouteStations, allStations, station);
			}
			routeTable[i] = shortestRouteStations;
			//System.out.println("Shortest Route: " + shortestRouteStations + "\n");
			allStations = (ArrayList<Station>) this.getStations();
			shortestRouteStations = new ArrayList<Station>(allStations.size());
		}

		initiated = true;
	}

	private void updateRoutes(ArrayList<Station> shortestRouteStations, ArrayList<Station> allStations,
			Station station) {
		shortestRouteStations.add(station);
		allStations.remove(station);
		//System.out.println("Stations In Shourtest Route ==> " + Arrays.toString(shortestRouteStations.toArray()));
		//System.out.println("Remaining Stations          ==> " + Arrays.toString(allStations.toArray()) + "\n");
	}

	/*
	 * Find nearest station to current station
	 */
	private Station getNextStation(ArrayList<Station> stations, Station station) {
		int index = 0;
		int minValue = Integer.MAX_VALUE;
		for (int i = 0; i < stations.size(); i++) {
			int distance = stations.get(i).manhattanDistance(station);
			if (distance < minValue) {
				minValue = distance;
				index = i;
			}
		}
		return stations.get(index);
	}

	private Station getDestination(ArrayList<Station> stations, Station current) {
		int index = stations.indexOf(current);
		if (index == stations.size() - 1) {
			return stations.get(0);
		} else {
			return stations.get(index + 1);
		}
	}

	@Override
	public void go() {
		// If we have initialized bus route table before, skip
		if (!initiated)
			buildBusRouteTable();

		// Loop through each bus
		for (int i = 0; i < this.getBusses().size(); i++) {
			// A bus that isn't at its destination yet won't listen to commands,
			// so skip it.
			Bus b = this.getBusses().get(i);
			if (!b.atDestination())
				continue;

			// If your destination is current bus stop, please exit.
			List<Passenger> passengers = b.getPassengers();
			Station s = b.getStation();
			//System.out.println("Current: " + s.toString());
			//System.out.println("Bus: " + b.toString());
			//System.out.println("Inside passengers: " + passengers);
			for (Passenger p : passengers) {
				if (p.getDestination().equals(s)) {
					p.exitBus();
					//System.out.println("p exits bus: " + p);
				}
			}
			//System.out.println("after exit bus: " + passengers);

			// Each passenger at the station has a chance of entering the bus
			for (Passenger p : s.getPassengers()) {
				if (!passengers.contains(p)) // Make sure that a passenger who
												// just got off doesn't get back
												// on.
					p.enterBus(b);
			}
			//System.out.println("after enter bus: " + b.getPassengers());
			//System.out.println("bus " + i + " route table: " + routeTable[i]);
			Station desc = getDestination(routeTable[i], s);
			b.setDestination(desc);
			//System.out.println("bus destination: " + b.getDestination() + "\n");
		}
	}
}
