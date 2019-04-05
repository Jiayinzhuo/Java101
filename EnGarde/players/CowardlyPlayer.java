package players;

import java.util.Arrays;

/**
 * A player that always chooses the legal move that brings it farthest from its
 * opponent.
 * 
 * @author eliotkaplan
 * 
 */
public class CowardlyPlayer extends Player {

	public CowardlyPlayer(String name) {
		super(name);
	}

	@Override
	public int move() {
		int[] poss = getPossibleMoves();
		Arrays.sort(poss);
//		for (int i=0; i<poss.length; i++)
//			System.out.println("Coward: " + poss[i]);
		if (getLocation() < getOpponentLocation())
			return poss[0];
		else {
			return poss[poss.length - 1];
		}
	}

}
