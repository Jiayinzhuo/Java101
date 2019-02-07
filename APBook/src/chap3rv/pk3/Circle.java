package chap3rv.pk3;

public class Circle extends Shape {

	private double radius;

	// constructor
	public Circle(double circleRadius, String circleName) {
		super(circleName);
		radius = circleRadius;
	}

	@Override
	public double area() {
		return Math.PI * radius * radius;
	}

	@Override
	public double perimeter() {
		return 2 * Math.PI * radius;
	}

}
