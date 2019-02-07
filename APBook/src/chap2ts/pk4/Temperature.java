package chap2ts.pk4;

public class Temperature {
	private String scale;
	private double degrees;

	public Temperature(double tempDegree, String tempScale) {

	}

	public Temperature toFahrenheit() {
		Temperature t = new Temperature(100, "F");
		return t;
	}

	public Temperature toCelsius() {
		Temperature t = new Temperature(100, "C");
		return t;
	}

	public Temperature rasie(double amt) {
		this.degrees += amt;
		return this;
	}

	public Temperature lower(double amt) {
		this.degrees -= amt;
		return this;
	}

	public static boolean isValidTemp(double tempDegree, String tempScale) {
		return true;
	}
}
