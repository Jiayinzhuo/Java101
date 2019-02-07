package qfr4;

public class ArrayUtil {
	public static void ShiftArray(int[] arr, int num) {
		for (int i = arr.length - 1; i > 0; i--) {
			System.out.println("before shift: arr[i]: " + arr[i] + " arr[i-1]: " + arr[i - 1]);
			arr[i] = arr[i - 1];
		}
		arr[0] = num;

	}

	public static void main(String[] args) {
		int[] arr = { 11, 12, 13, 14, 15 };
		ShiftArray(arr, 27);
	}

}
