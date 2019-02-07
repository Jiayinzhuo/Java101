package q13;

public class Test {
	private static int[] numbers = { 2, 1, 3 };

	public static int mystery(int num) {
		for (int k = numbers.length - 1; k >= 0; k--) {
			if (numbers[k] < num) {
				System.out.println("k is: " + k + " numbers[k] is: " + numbers[k]);

				return k;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int m = mystery(2);
		System.out.println("m is: " + m);

	}

}
