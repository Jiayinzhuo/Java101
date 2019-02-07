
public class Reverse {

	public static void main(String args[]) {
		int k;
		k = reverse(234);

		System.out.println(k);
	}

	public static int reverse(int n) {
		int rem, revNum = 0;

		for (int i = 0; i <= n; i++) {
			rem = n % 10;
			revNum = revNum * 10 + rem;
			n /= 10;
		}

		return revNum;

	}

}
