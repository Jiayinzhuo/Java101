package Coordinators;

import java.util.Random;

import Simulation.BusCoordinator;
import Simulation.BusSimulator;

public class Grader {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		grade(NearestNeighborCoordinator.class, 123, 100);
	}

	public static void grade(@SuppressWarnings("rawtypes") Class c, long seed, int nTrials)
			throws InstantiationException, IllegalAccessException {
		double total = 0;
		double fails = 0;
		Random r = new Random(seed);
		for (int i = 0; i < nTrials; i++) {
			System.out.println(i);
			BusCoordinator coord = (BusCoordinator) (c.newInstance());
			BusSimulator sim = new BusSimulator(coord, 50 + r.nextInt(150), 50 + r.nextInt(150), 100 + r.nextInt(900),
					50 + r.nextInt(150), 1 + r.nextInt(30), 1 + r.nextInt(10), r.nextInt());
			int time = sim.run();
			if (time == Integer.MAX_VALUE)
				fails++;
			else
				total += time;
		}
		System.out.println("FAILED: " + (100 * fails / nTrials) + "%");
		System.out.println("AVERAGE TIME: " + (total / (nTrials - fails)));
	}

}
