package chap7rv.pk1;

import java.util.Scanner;

public class WordPlay {
	public static void stackWords() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String word = scanner.next();

		if (word.equals("."))
			System.out.println();
		else {
			System.out.println("before going to to stack: " + word);
			stackWords();
		}
		System.out.println(word);

	}

	public static void main(String[] args) {
		System.out.println("Enter list of words, one per line.");
		System.out.println("Final word should be a .");
		stackWords();

	}

}
