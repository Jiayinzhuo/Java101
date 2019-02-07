package exam2.pk3;

public class Clock {
	private int hour;
	private int minute;
	private int second;
	
	public Clock(int h, int m, int s) {
		this.hour = h;
		this.minute = m;
		this.second = s;
	}

	public void setTime(int h, int m, int s) {
		this.hour = h;
		this.minute = m;
		this.second = s;
	}

	public String getTime() {
		return this.hour + " hour " + this.minute + " minute " + this.second + " second";
	}

	public static void main(String[] args) {
//		Clock[2][3] allClocks = new Clock[2][3]; 
//		for (Clock[] row : allClocks)
//			for (Clock c : row)
//				c = new Clock(0, 0, 0);
	}

}
