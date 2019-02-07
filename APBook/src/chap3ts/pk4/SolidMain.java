package chap3ts.pk4;

public class SolidMain {

	public static void printVolume(Solid s) {
		System.out.println("Volume = " + s.volume() + " cubic units");
	}

	public static void main(String[] args) {
		Solid sol;
		Solid sph = new Sphere("sphere", 4);
		Solid rec = new RectangularPrism("box", 3, 6, 9);
		int flipCoin = (int) (Math.random() * 2);
		if (flipCoin == 0) {
			sol = sph;
			System.out.println("Sphere");
		} else {
			sol = rec;
			System.out.println("RectangularPrism");
		}
		printVolume(sol);
	}

}
