package Coordinators;

import Simulation.BusCoordinator;
import Simulation.BusSimulator;

public class BusRouteRunner {

	public static void main(String[] args) {
		BusCoordinator coord = new NearestNeighborCoordinator();
		// BusSimulator(BusCoordinator coordinator, int width, int height, int nPassengers, int nStations, int nBusses, int busCapacity)

		BusSimulator sim = new BusSimulator(coord, 10, 10, 3, 3, 2, 8, -8);
		//BusSimulator sim = new BusSimulator(coord, 100, 100, 200, 40, 6, 8);
		
		//BusSimulator sim = new BusSimulator(coord, 144, 190, 982, 72, 9, 18, -122552521);   //grader finished in 30297 timesteps
		//BusSimulator sim = new BusSimulator(coord, 89, 106, 228, 92, 10, 13, 209048196);   //grader finished in 11630 timesteps
		//BusSimulator sim = new BusSimulator(coord, 111, 173, 878, 35, 21, 16, -1579779532);   //grader finished in 8917 timesteps
		//BusSimulator sim = new BusSimulator(coord, 57, 79, 231, 35, 42, 23, -1868969740);   //grader finished in 3341 timesteps
		//BusSimulator sim = new BusSimulator(coord, 135, 137, 282, 16, 6, 14, -1113596828);   //grader finished in 3961 timesteps
		//BusSimulator sim = new BusSimulator(coord, 109, 151, 176, 15, 28, 9, -626724400);   //grader finished in 2063 timesteps
		//BusSimulator sim = new BusSimulator(coord, 92, 161, 953, 76, 33, 17, -596161069);   //grader finished in 10970 timesteps
		//BusSimulator sim = new BusSimulator(coord, 94, 77, 183, 57, 10, 22, -1185548804);   //grader finished in 6266 timesteps
		//BusSimulator sim = new BusSimulator(coord, 61, 172, 924, 75, 3, 5, -1151505612);   //grader finished in 191404 timesteps
		//BusSimulator sim = new BusSimulator(coord, 80, 59, 692, 43, 24, 13, -68376346);   //grader finished in 4834 timesteps
		//BusSimulator sim = new BusSimulator(coord, 101, 109, 853, 67, 34, 23, 92081762);   //grader finished in 6774 timesteps
		//BusSimulator sim = new BusSimulator(coord, 165, 115, 375, 84, 14, 24, 292464405);   //grader finished in 14193 timesteps
		//BusSimulator sim = new BusSimulator(coord, 153, 177, 544, 26, 30, 7, 1750007448);   //grader finished in 8672 timesteps
		//BusSimulator sim = new BusSimulator(coord, 188, 145, 304, 50, 50, 5, 123672506);  //grader finished in 7897 timesteps
		//BusSimulator sim = new BusSimulator(coord, 71, 171, 888, 15, 15, 9, 1062544439);   //grader finished in 4251 timesteps
		//BusSimulator sim = new BusSimulator(coord, 123, 143, 828, 93, 10, 7, 1386902099);   //grader finished in 57957 timesteps
		//BusSimulator sim = new BusSimulator(coord, 118, 149, 765, 71, 41, 10, 135029011);   //grader finished in 11260 timesteps
		//BusSimulator sim = new BusSimulator(coord, 190, 119, 313, 27, 18, 6, -733208057);   //grader finished in 6595 timesteps
		//BusSimulator sim = new BusSimulator(coord, 101, 63, 971, 83, 39, 15, -230448700);   //grader finished in 7449 timesteps
		//BusSimulator sim = new BusSimulator(coord, 131, 58, 822, 59, 45, 12, -639815328);   //grader finished in 6846 timesteps
		int time = sim.run();
		System.out.println("Completed in " + time + " timesteps");
	}

}
