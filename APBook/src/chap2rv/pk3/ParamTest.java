package chap2rv.pk3;

public class ParamTest {

	public static void foo(int x, double y) {
		x = 3;
		y = 2.5;
	}

	public static void main(String[] args) {
		int a = 7;
		double b = 6.5;
		foo(a, b);

		System.out.println(a + " " + b);
		// Nothing was passed back from foo
		// should be still 7 6.5, right?
	}

}
