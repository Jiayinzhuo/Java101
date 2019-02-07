package chap7ts.pk1;

public class Recur {

	public int recur(int[] x, int n) {
		int t;
		if (n == 1)
			return x[0];
		else {
			t = recur(x, n - 1);
			if (x[n - 1] > t)
				return x[n - 1];
			else
				return t;
		}
	}

	public void printString(String s) {
		if (s.length() > 0) {
			printString(s.substring(1));
			System.out.println(s.substring(0, 1));
		}
	}

	public static void main(String[] args) {
		Recur r = new Recur();
		r.printString("cat");
	}

}
