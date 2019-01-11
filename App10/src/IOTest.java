import java.io.IOException;

public class IOTest {
	public static void main(String[] args) {
		try {
			// let's just try reading from the keyboard
			byte bArray[] = new byte[128];
			System.out.println("Enter something:");

			// the following reads in an array of bytes
			System.in.read(bArray);

			// output the array of bytes - this generates
			// peculiar results
			System.out.print("You entered:");
			System.out.println(bArray);

			// let's investigate
			Class cInClass = System.in.getClass();
			Class cOutClass = System.out.getClass();
			System.out.println("in is " + cInClass.toString());
			System.out.println("out is " + cOutClass.toString());
		} catch (IOException ioe) {
			System.out.println(ioe.toString());
			ioe.printStackTrace();
		}
	}
}
