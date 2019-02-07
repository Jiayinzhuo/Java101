package chap2ts.pk5;

public class IntObject {
	private int num;

	public IntObject() {
		num = 0;
	}

	public IntObject(int n) {
		num = n;
	}

	public void increment() {
		num++;
	}

	public int getNum() {
		return this.num;
	}
}
