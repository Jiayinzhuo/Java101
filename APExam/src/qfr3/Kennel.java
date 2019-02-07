package qfr3;

import java.util.ArrayList;
import java.util.List;

public class Kennel {

	private static List<Pet> petList = new ArrayList<Pet>();

	public static void allSpeak() {
		for (Pet p : petList) {
			String name = p.getName();
			String sound = p.speak();
			System.out.println(name + " " + sound);
		}
	}

	public static void main(String[] args) {
		Pet p1 = new Cat("C1");
		Dog p2 = new Dog("D1");
		LoadDog p3 = new LoadDog("D2");
		petList.add(p1);
		petList.add(p2);
		petList.add(p3);
		allSpeak();
	}

}
