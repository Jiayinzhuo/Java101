package q23;

public class Test {
	public static int[] shuffle(int[] nums) {
		int n = nums.length;
		int[] result = new int[n];

		for (int j = 0; j < n / 2; j++) {
			result[j * 2] = nums[j];
			result[j * 2 + 1] = nums[j + n / 2];
			System.out.println("n/2: " + n / 2);
			System.out.println("result[j*2]: " + nums[j]);
			System.out.println("result[j*2+1]: " + nums[j + n / 2]);
		}

		return result;
	}

	public static void main(String[] args) {
		int[] nums = { 10, 20, 30, 40, 50, 60, 70 };
		int[] results = shuffle(nums);
		for (int i = 0; i < results.length; i++) {
			System.out.println("result[i]: " + results[i]);
		}

	}

}
