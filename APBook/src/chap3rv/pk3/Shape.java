package chap3rv.pk3;

public abstract class Shape {
	private String name;

	// construct
	public Shape(String shapeName) {
		name = shapeName;
	}

	public String getName() {
		return name;
	}

	public abstract double area();

	public abstract double perimeter();

	public double semiPerimeter() {
		return perimeter() / 2;
	}

	public static void main(String[] args) {
		Shape circ = new Circle(10, "circle");
		Shape sq = new Square(10, "square");
		Shape s = null;

		s = circ;
		System.out.println("Area of " + s.getName() + " is " + s.area());
		s = sq;
		System.out.println("Area of " + s.getName() + " is " + s.area());

	}

}
