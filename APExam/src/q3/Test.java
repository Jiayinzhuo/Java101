package q3;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void mystery(List<Integer> nums) {
		for (int k = 0; k < nums.size(); k++) {
			if (nums.get(k).intValue() == 0) {
				System.out.println("k: " + k + " nums value: " + nums.get(k));
				nums.remove(k);
			}
		}

		System.out.println("New List:");
		for (int i = 0; i < nums.size(); i++) {
			System.out.println("i: " + i + " nums value: " + nums.get(i));
		}
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(0);
		list.add(0);
		list.add(4);
		list.add(2);
		list.add(5);
		list.add(0);
		list.add(3);
		list.add(0);
		mystery(list);
		// dynamically changing nums.size(), k keeps moving
	}

}
