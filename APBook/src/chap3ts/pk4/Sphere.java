package chap3ts.pk4;

public class Sphere extends Solid {

	private double radius;

	// constructor
	public Sphere(String sphereName, double sphereRadius) {
		super(sphereName);
		radius = sphereRadius;
	}

	@Override
	public double volume() {
		return (4.0 / 3.0) * Math.PI * radius * radius * radius;
	}

}
