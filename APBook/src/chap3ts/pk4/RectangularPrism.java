package chap3ts.pk4;

public class RectangularPrism extends Solid {

	private double length;
	private double width;
	private double height;

	// constructor
	public RectangularPrism(String prismName, double l, double w, double h) {
		super(prismName);
		length = l;
		width = w;
		height = h;
	}

	@Override
	public double volume() {
		return length * width * height;
	}

}
