package chap2ts.pk5;

public class IntObjectTest {

	public static IntObject someMethod(IntObject obj) {
		IntObject ans = obj;
		ans.increment();
		return ans;
	}

	public static void main(String[] args) {
		IntObject x = new IntObject(2);
		IntObject y = new IntObject(7);
		IntObject a = y;

		System.out.println("before x = someMethod(y), x is: " + x.getNum() + " " + x.toString());
		System.out.println("before x = someMethod(y), y is: " + x.getNum() + " " + y.toString());
		System.out.println("before x = someMethod(y), a is: " + x.getNum() + " " + a.toString());

		x = someMethod(y); // object ans assigns to x

		System.out.println("after x = someMethod(y), x is: " + x.getNum() + " " + x.toString());

		a = someMethod(x);

		System.out.println("x: " + x.getNum() + " " + x.toString());
		System.out.println("y: " + y.getNum() + " " + y.toString());
		System.out.println("a: " + a.getNum() + " " + a.toString());
		// Should be 9 9 9, right? Why?
	}

}
