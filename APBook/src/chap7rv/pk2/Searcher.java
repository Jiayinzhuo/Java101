package chap7rv.pk2;

import java.util.Scanner;

public class Searcher {
	public boolean search(String[] a, String key) {
		return recurSearch(a, 0, key);
	}

	private boolean recurSearch(String[] a, int startIndex, String key) {
		if (startIndex == a.length)
			return false;
		else if (a[startIndex].compareTo(key) == 0)
			return true;
		else
			return recurSearch(a, startIndex + 1, key);
	}

	public static void main(String[] args) {
		String[] list = { "Mary", "Joe", "Lee", "Jake" };
		Searcher s = new Searcher();
		System.out.println("Enter key: Mary, Joe, Lee or Jake.");
		Scanner scanner = new Scanner(System.in);
		String key = scanner.next();

		boolean result = s.search(list, key);
		if (!result)
			System.out.println(key + " was not found.");
		else
			System.out.println(key + " was found.");

	}

}
