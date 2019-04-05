package players;

import java.util.Arrays;

public class MyPlayer extends Player {

	public MyPlayer(String name) {
		super(name);
	}

	public int move() {
		int myLoc = getLocation();
		int oppLoc = getOpponentLocation();
		int[] poss = getPossibleMoves();
		Arrays.sort(poss);

		// if I have right card to kill opponent, use it
		for (int i = 0; i <= poss.length - 1; i++) {
			int newLocation = myLoc + poss[i];
			if (oppLoc == newLocation) {
				return poss[i];
			}
		}

		// Be aggressive, maximize aggression
		// Be cautious, minimize loss (Keep 6 positions away from opponent).
		// Opponent moves 1 to 5 steps, uses corresponding cards to win
		// The more 6-away positions you have, the more opportunities you have
		// to win
		final int IDEAL_DISTANCE = 6;
		if (myLoc > oppLoc) {
			for (int i = 0; i <= poss.length - 1; i++) {
				int newLocation = myLoc + poss[i];
				if (newLocation - oppLoc >= IDEAL_DISTANCE) {
					return poss[i];
					// if not, looking for next best position
				}
			}

			// Fall back solution is to be the most aggressive
			return poss[0];

		} else {
			for (int i = poss.length - 1; i >= 0; i--) {
				int newLocation = myLoc + poss[i];
				if (oppLoc - newLocation >= IDEAL_DISTANCE) {
					return poss[i];
				}
			}

			return poss[poss.length - 1];

		}
	}
}
