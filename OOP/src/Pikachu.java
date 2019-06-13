
public class Pikachu extends Pokemon {
	
	private double evasiveAbility;

	public Pikachu(double input) {

		setEvasiveAbility(input);
	}

	public void getStats() {
		super.getStats();
		System.out.println("Evasive Skill is: " + evasiveAbility);
		if (life < 75 && life > 0) {
			System.out.println("Almost dead");
		}
		System.out.println();
	}

	public void setLife() {
		super.setLife();
		life -= 70;
	}

	public void setDmg() {
		super.setDmg();
		dmg -= 20;
}

	public void setEvasiveAbility(double personalAbility) {
		evasiveAbility = personalAbility;
	}

	public void setProtection() {
		super.setProtection();
		protection -= 5;
	}

	public String responseToDisaster() {
		if ((Math.random() * evasiveAbility) > 0.5) {
			disasterDamage *= (evasiveAbility * 0.5);
		}
		return super.responseToDisaster();
	}

}
