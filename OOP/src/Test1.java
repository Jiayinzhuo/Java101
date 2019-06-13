
public class Test1 {
	public static void main(String[] args) {
		//Snorlax adam = new Snorlax();
		//Snorlax eve = new Snorlax();
		//Pikachu lilith = new Pikachu(0.6);
		//Pokemon people[] = new Pokemon[] { adam, eve, lilith };
		System.out.println("A conflict has ocurred in the room.");
		/*int NaturalDisasterDamage = 200;
		for (int i = 0; i < 3; i++) {
			System.out.println("Subject " + (i + 1) + ":");
			people[i].setDisasterDamage(NaturalDisasterDamage);
			System.out.println(people[i].responseToDisaster());
			people[i].getStats();
		} */
		Snorlax abraham = new Snorlax();
		Pikachu isaac = new Pikachu(0.5);
		while(abraham.getStatus() && isaac.getStatus()) {
			int a = isaac.dealDamage();
			int b = abraham.dealDamage();
			abraham.setDisasterDamage(a);
			isaac.setDisasterDamage(b);
			abraham.responseToDisaster();
			System.out.println("Combattant 1:");
			System.out.println(abraham.responseToDisaster());
			abraham.getStats();
			isaac.responseToDisaster();
			System.out.println("Combattant 2:");
			System.out.println(abraham.responseToDisaster());
			isaac.getStats();
		}
	}
}
