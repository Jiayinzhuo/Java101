package chap3ts.pk4;

public abstract class Solid {
	private String name;

	// constructor
	public Solid(String solidName) {
		name = solidName;
	}

	public String getName() {
		return name;
	}

	public abstract double volume();
	
	public static void main(String[] args) {
		// Solid s1, s2, s3, s4;
		// s1 = new Solid("blob");
		// s2 = new Sphere("sphere", 3.8);
		// s3 = new RectangularPrism("box", 2, 4, 6.5);
		// s4 = null;
	}

}
