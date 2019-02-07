package q8;

public class TimeRecord {
	private int hours;
	private int minutes;

	public TimeRecord(int h, int m) {
		hours = h;
		minutes = m;
	}

	public int getHours() {
		return this.hours;

	}

	public int getMinutes() {
		return this.minutes;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public void advance(int h, int m) {
		hours = hours + h;
		minutes = minutes + m;

		hours = hours + minutes / 60;
		minutes = minutes % 60;
	}

	public static void main(String[] args) {
		TimeRecord[] timeCards = new TimeRecord[3];

		for (int i = 0; i < 3; i++) {
			TimeRecord temp = new TimeRecord(i, i);
			timeCards[i] = temp;
		}

		TimeRecord total = new TimeRecord(0, 0);
		for (int k = 0; k < timeCards.length; k++) {
			total.advance(timeCards[k].getHours(), timeCards[k].getMinutes());
		}

		System.out.println("Total Hours: " + total.getHours() + " Total Minutes: " + total.getMinutes());

	}

}
