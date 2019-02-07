package q18;

public class Test {
	public static void changer(String x, int y) {
		x = x + "peace";
		y = y * 2;

		System.out.println("Inside changer x: " + x + " y: " + y);
	}

	// What if change to changer2
	public static String changer2(String x, int y) {
		x = x + "peace"; //x's ID changed from 18 to 26
		y = y * 2;

		System.out.println("Inside changer2 x: " + x + " y: " + y);
		return x;
	}

	// What if change to changer3
	public static int changer3(String x, int y) {
		x = x + "peace"; //x's ID changed from 18 to 28
		y = y * 2;

		System.out.println("Inside changer3 x: " + x + " y: " + y);
		return y;
	}

	public static void main(String[] args) {
		String s = "world";
		int n = 6;
		changer(s, n);
		System.out.println("Test 1 s: " + s + " n: " + n);

		// Pass it back s
		s = "world";
		n = 6;
		s = changer2(s, n); //s's ID was 18, inside changer2 changed x's ID to 26, passed back, assigned to s, now s's ID is 26
		System.out.println("Test 2 s: " + s + " n: " + n);

		// Pass it back n
		s = "world";
		n = 6;
		n = changer3(s, n); //s's ID was 18, inside changer3 changed s'ID to 28, x did not pass back, s's ID is still 18
		System.out.println("Test 3 s: " + s + " n: " + n);
	}

}
