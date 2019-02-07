package chap3ts.pk7;

public class TemperatureMain {
	public static Orderable min(Orderable a, Orderable b) {
		if (a.compareTo(b) < 0)
			return a;
		else
			return b;
	}

	public static Orderable minThree(Orderable a, Orderable b, Orderable c) {
		return min(min(a, b), c);
	}

	public static void main(String[] args) {
		// Temperature t1 = new Temperature("C", 85);
		// Temperature t2 = new Temperature("F", 45);
		// Temperature t3 = new Temperature("F", 120);
		// System.out.println("The lowest temp is " + minThree(t1, t2, t3));
		//
		// Orderable c1 = new Temperature("C", 85);
		// Orderable c2 = new Temperature("F", 45);
		// Orderable c3 = new Temperature("F", 120);
		// System.out.println("The lowest temp is " + minThree(c1, c2, c3));

	}

}
