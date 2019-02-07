package q25;

public class Test {
	public static void sort(int[] elements) {

		for (int j = 0; j < elements.length - 1; j++) {
			int index = j;

			for (int k = j + 1; k < elements.length; k++) {
				if (elements[k] < elements[index]) {
					// System.out.println("j: " + j + " index: " + index + "
					// elements[index]: " + elements[index]);
					// System.out.println("k: " + k + " elements[k]: " +
					// elements[k]);
					index = k;
					// System.out.println("New index: " + index);
				}
			}

			int temp = elements[j];
			elements[j] = elements[index];
			elements[index] = temp;
			// System.out.println("Now elements[index]: " + temp);
		}
	}

	public static void main(String[] args) {
		int[] elements = { 1, 0, 5, 3, 6, 9, 8, 7 };
		System.out.println("{ 1, 0, 5, 3, 6, 9, 8, 7 }");
		sort(elements);
	}

}
