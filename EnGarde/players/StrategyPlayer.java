package players;

import java.util.Arrays;

public class StrategyPlayer extends Player {

	public StrategyPlayer(String name) {
		super(name);
	}

	public int move() {
		int[] poss = getPossibleMoves();
		Arrays.sort(poss);
		// for (int i = 0; i < poss.length; i++)
		// System.out.println("Optimized: " + poss[i]);

		int mLoc = getLocation();
		int oLoc = getOpponentLocation();
		// System.out.println("mLoc: " + mLoc + " oLoc: " + oLoc);

		// If player has the card to defect opponent, use it
		for (int i = poss.length - 1; i >= 0; i--) {
			int newLoc = mLoc + poss[i];
			if (oLoc == newLoc)
				return poss[i];
		}

		// Be aggressive, maximize aggression
		// Be cautious, minimize loss (Keep 6 positions away from opponent).
		// Opponent moves 1 to 5 steps, uses corresponding cards to win
		// The more 6 away positions, the more opportunities to win
		final int IDEAL_DISTANCE = 6;
		if (oLoc > mLoc) {
			for (int i = poss.length - 1; i >= 0; i--) {
				int newLoc = mLoc + poss[i];
				if (oLoc - newLoc >= IDEAL_DISTANCE) {
					return poss[i];
					// if not, looking for next best position
				}
			}
			return poss[poss.length - 1];

		} else {
			for (int i = 0; i <= poss.length - 1; i++) {
				int newLoc = mLoc + poss[i];
				if (newLoc - oLoc >= IDEAL_DISTANCE) {
					return poss[i];
				}
			}
			return poss[0];

		}
	}
}
