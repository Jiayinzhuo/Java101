package AP2017;

import java.util.ArrayList;

public class Digits {
	private ArrayList<Integer> digitList;

	public Digits(int num) {
		digitList = new ArrayList<Integer>();
		while (num != 0) {
			digitList.add(num % 10);
			System.out.println("num % 10: " + num % 10);
			num /= 10;
			System.out.println("num / 10: " + num / 10);
		}

		System.out.println(digitList);

	}
	
/*	
	public Digits(int num) {
		digitList = new ArrayList<Integer>();
		if (num == 0) {
			digitList.add(new Integer(0));
		}
		while (num > 0) {
			digitList.add(0, new Integer(num % 10));
			System.out.println("num % 10: " + num % 10);
			num /= 10;
			System.out.println("num / 10: " + num / 10);
		}

		System.out.println(digitList);

	}
*/
	public static void main(String[] args) {
		Digits list = new Digits(23);
	}
}
