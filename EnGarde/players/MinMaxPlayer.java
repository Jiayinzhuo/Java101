package players;

import java.util.Arrays;

public class MinMaxPlayer extends Player {

	public MinMaxPlayer(String name) {
		super(name);
	}

	@Override
	public int move() {
		int[] poss = getPossibleMoves();
		Arrays.sort(poss);
//		for (int i = 0; i < poss.length; i++)
//			System.out.println("MinMax: " + poss[i]);
		int step = minimax(0, 1);
		return step;
	}

	public int minimax(int depth, int who) {
		int[] poss = getPossibleMoves();
		Arrays.sort(poss);
//		for (int i = 0; i < poss.length; i++)
//			System.out.println("MinMax: " + poss[i]);

		if (poss == null || poss.length == 0)
			return 0;

		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

		for (int j = 0; j < poss.length; j++) {
			int v = poss[j];
			if (who > 0) {
				int currentScore = minimax(depth + 1, -who);
				max = Math.max(currentScore, max);
				System.out.println("current max thread depth is: " + depth + "currentScore is: " + currentScore);

				if (depth == 0) {
					System.out.println("max depth is: " + depth + "best score is: " + max);
					break;
				}
			} else {
				int currentScore = minimax(depth + 1, who);
				min = Math.min(currentScore, min);
				System.out.println("current min thread depth is: " + depth + "v is: " + v);

				if (depth == 0) {
					System.out.println("min depth is: " + depth + "best score is: " + min);
					break;
				}
			}
		}
		return who == 1 ? max : min;
	}

	protected int minimaxScore(int depth, int who) {
		return minimax(depth - 1, -who);
	}

}
