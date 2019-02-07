package chap2ts.pk1;

public class DateTest {

	public static void main(String[] args) {
		// #8
		Date d = new Date(2, 17, 1948);
		d.write();

		// #10
		int mo = 2;
		int da = 17;
		int yr = 1948;

		Date d1 = new Date(mo, da, yr);
		Date d2 = d1;
		Date d3 = new Date(mo, da, yr);
		Date d4 = new Date(d1.month(), d1.day(), d1.year());
	}

}
