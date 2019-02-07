package chap2ts.pk1;

public class Date {
	private int day;
	private int month;
	private int year;

	public Date() {
	}

	public Date(int mo, int da, int yr) {
		this.month = mo;
		this.day = da;
		this.year = yr;
	}

	public int month() {
		return month;
	}

	public int day() {
		return day;
	}

	public int year() {
		return year;
	}

	public String toString() {
		String s = month + "/" + day + "/" + year;
		return s;
	}

	public void write() {
		System.out.println(month + "/" + day + "/" + year);
		System.out.println(month() + "/" + day() + "/" + year());
		System.out.println(this); // println(this) will call toString()
	}
}
