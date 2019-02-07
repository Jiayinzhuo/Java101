package chap2ts.pk6;

public class TesterMain {

	public static void main(String[] args) {
		int x = 6, y = 8;
		Tester tester = new Tester();
		tester.someMethod(x, y);

		System.out.println("x: " + x);
		System.out.println("y: " + y);
		// someMethod did not pass back any results
		// Should be still 6, 8, right?
	}

}
