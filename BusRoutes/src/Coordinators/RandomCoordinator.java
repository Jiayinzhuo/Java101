package Coordinators;

import java.util.List;
import java.util.Random;

import Simulation.Bus;
import Simulation.BusCoordinator;
import Simulation.Passenger;
import Simulation.Station;

/**
 * An extremely bad coordinator provided as an example of how one might use the
 * provided functions to make a coordinator that does something. This one just
 * shuttles people around totally at random without regard for where they want
 * to go.
 */
public class RandomCoordinator extends BusCoordinator {

	@Override
	public void go() {
		Random r = new Random();
		// Loop through each bus
		for (Bus b : this.getBusses()) {
			// A bus that isn't at its destination yet won't listen to commands,
			// so skip it.
			if (!b.atDestination())
				continue;
			// Each passenger on the bus has a 50% chance of exiting.
			List<Passenger> passengers = b.getPassengers();
			System.out.println("Bus: " + b.toString());
			System.out.println("Inside passengers: " + passengers);
			for (Passenger p : passengers) {
				if (r.nextBoolean())
					p.exitBus();
			}
			System.out.println("after exit bus: " + passengers);
			// Each passenger at the station has a 50% chance of entering the
			// bus.
			Station s = b.getStation();
			System.out.println("Current Station: " + s.toString());
			for (Passenger p : s.getPassengers()) {
				if (!passengers.contains(p)) // Make sure that a passenger who
												// just got off doesn't get back
												// on.
					p.enterBus(b);
			}
			System.out.println("after enter bus: " + b.getPassengers());
			// Send the bus over to a random other station.
			List<Station> stations = getStations();
			// System.out.println("station list: " + stations);
			b.setDestination(stations.get(r.nextInt(stations.size())));
			System.out.println("bus destination: " + b.getDestination());
			System.out.println();
		}
	}
}
