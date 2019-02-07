package q16;

public class Mystery {
	public static int mystery(int n) {
		if (n <= 1)
			return 0;
		else
			return 1 + mystery(n / 2);
	}

	public static void main(String[] args) {
		int t = Mystery.mystery(8);
		System.out.println("t is: " + t);
	}

}
