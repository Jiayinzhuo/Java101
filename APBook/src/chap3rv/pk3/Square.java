package chap3rv.pk3;

public class Square extends Shape {

	private double side;

	// constructor
	public Square(double squareSide, String squareName) {
		super(squareName);
		side = squareSide;
	}

	@Override
	public double area() {
		return side * side;
	}

	@Override
	public double perimeter() {
		return 4 * side;
	}

}
