package chap6rv.pk1;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {

	public static void main(String[] args) {

		// Create an ArrayList with 0, 1, 4, 9
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 4; i++)
			list.add(i * i);

		Integer intOb = list.get(2);

		// Integer is retrieved and auto convert to int
		int n = list.get(3);

		// list is 0, 1, 4, 9
		// list will be 0, 1, 4, 5
		Integer x = list.set(3, 5);

		// list will be 0, 1, 5
		x = list.remove(2);

		// list will be 0, 7, 1, 5
		list.add(1, 7);

		// list will be 0, 7, 8, 1, 5
		list.add(2, 8);

		for (Integer num : list)
			System.out.println(num);

		swap(list, 0, 3);

		// list should be 1, 7, 8, 0, 5
		System.out.println("New List:");
		for (Integer num : list)
			System.out.println(num);

		// list should be 1, 7, 8, 0, 5
		System.out.println("Less than 3 value:");
		for (Integer num : list)
			if (num.intValue() < 3)
				System.out.println(num);

	}

	public static void swap(List<Integer> list, int i, int j) {
		Integer temp = list.get(i);
		list.set(i, list.get(j));
		list.set(j, temp);

	}

}
