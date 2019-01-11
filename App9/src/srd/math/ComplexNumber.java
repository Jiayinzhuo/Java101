package srd.math;

public class ComplexNumber {
	private double real;
	private double imag;

	// constructors
	public ComplexNumber(double r, double i) {
		real = r;
		imag = i;
	}

	public ComplexNumber(double r) {
		this(r, 0.0);
	}

	// division operator written to use exceptions
	public ComplexNumber Divide(double d) throws Exception {
		if (d == 0) {
			throw new Exception("Attempted divide by zero in ComplexNumber.divide");
		}
		return new ComplexNumber(real / d, imag / d);
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append('(').append(real).append(',');
		sb.append(imag).append(')');
		return sb.toString();
	}
}
