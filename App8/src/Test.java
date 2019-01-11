import srd.math.*;

public class Test {
	public static void main(String[] s) {
		// create two complex numbers and add them together
		ComplexNumber c1 = new ComplexNumber(1.0, 2.0);
		ComplexNumber c2 = new ComplexNumber(1.0, 0.0);
		ComplexNumber cSumm = c1.Add(c2);

		// ComplexNumber.toString() converts complex into String
		System.out.println(c1.toString() + " + " + c2.toString() + " = " + cSumm.toString());

	}
}
