package chap3rv.pk2;

public class Dancer {

	public void act() {
		System.out.println(" Spin");
		doTrick();
	}

	public void doTrick() {
		System.out.println(" float");
	}

	public static void main(String[] args) {
		Dancer a = new Acrobat();
		a.act();
		// Should be Spin somersault flip, right?
	}
}

// To simply, did not create public class Acrobat in another Java file
// Has to be NOT public class, one java file can take one public class
class Acrobat extends Dancer {
	public void act() {
		super.act();
		System.out.print(" flip");
	}

	public void doTrick() {
		System.out.println(" somersault");
	}
}
