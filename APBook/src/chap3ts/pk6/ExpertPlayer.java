package chap3ts.pk6;

public class ExpertPlayer extends HumanPlayer {
	private int rating;

	public int compareTo(ExpertPlayer expert) {
		return 0;
	}

	public static void main(String[] args) {
		Player c1 = new ExpertPlayer();
		Player c2 = new ExpertPlayer();

		int x;
		if (((ExpertPlayer) c1).compareTo((ExpertPlayer) c2) < 0)
			x = c1.getMove();
		else
			x = c2.getMove();

	}

	// Ignore Question 23, 24, 25

}
