
public class Snorlax extends Pokemon {

	public void getStats() {
		super.getStats();
		if (life < 100 && life > 0) {
			System.out.println("Almost dead");
		}
	}

	public void setProtection() {
		super.setProtection();
		protection += 20;
	}

}
