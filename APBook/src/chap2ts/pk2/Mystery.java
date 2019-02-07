package chap2ts.pk2;

public class Mystery {

	public static void strangeMethod(int x, int y) {
		x += y;
		y *= x;
		System.out.println(x + " " + y);
	}

	public static void main(String[] args) {
		int a = 6, b = 3;
		strangeMethod(a, b);
		System.out.print(a + " " + b);
		// strangeMethod did not pass anything back
		// Should be still 6 and 3

	}

}
