import srd.math.ComplexNumber;

public class MyClass {
	public static void main(String[] s) {
		try {
			ComplexNumber c = new ComplexNumber(4.0, 2.0);

			System.out.println(c.toString() + " / 2 = " + c.Divide(2.0).toString());

			System.out.println(c.toString() + " / 0 = " + c.Divide(0.0).toString());

			System.out.println(c.toString() + " / 4 = " + c.Divide(4.0).toString());
		} catch (Exception e) {
			System.out.println("Output from e.toString():");
			System.out.println(e.toString());
			System.out.println("\n");

			System.out.println("Output from e.printStackTrace():");
			e.printStackTrace();
		}
	}
}
