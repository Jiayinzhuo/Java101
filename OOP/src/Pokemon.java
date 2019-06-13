
abstract public class Pokemon implements PokemonInterface {
	int dmg;
	double accuracy;
	int life;
	int protection;
	int disasterDamage;

	public Pokemon() {
		setLife();
		setProtection();
		setDmg();
		setAccuracy();
	}

	public void setDisasterDamage(int a) {
		disasterDamage = a;
	}

	public void setLife() {
		life = 200;
	}

	public void setProtection() {
		protection = 5;
	}
	public boolean getStatus() {
		if(life > 0) {
			return true;
		}
		return false;
	}

	public void setDmg() {
			dmg = 70;
	}

	public void setAccuracy() {
		accuracy = 0.9;
	}

	public void getStats() {
		System.out.println("Dmg is: " + dmg);
		System.out.println("Accuracy is: " + accuracy);
		System.out.println("Protection is: " + protection);
		System.out.println();
	}

	public int dealDamage() {
		if ((Math.random() * accuracy) > 0.25) {
			return dmg;
		}
		else return 0;
	}

	public String responseToDisaster() {
		if (disasterDamage > protection) {
			life += (protection - disasterDamage);
		}
		if (life > 0) {
			return "Life is: " + ((Integer) life).toString();
		} else {
			return "Dead";
		}
	}

}
