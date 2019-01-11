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

	// operators
	public ComplexNumber Add(ComplexNumber cn) {
		return new ComplexNumber(real + cn.real, imag + cn.imag);
	}

	// toString - display a complex as (r,i)
	public String toString() {
		// build a StringBuffer into which to build output
		StringBuffer sb = new StringBuffer();

		// put the real part first
		sb.append('(').append(real).append(',');

		// now the imaginary part
		sb.append(imag).append(')');

		// convert the result into String
		return sb.toString();
	}
}
