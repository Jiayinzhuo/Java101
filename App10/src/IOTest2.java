import java.io.IOException;

public class IOTest2 {
	public static void main(String[] args) {
		try {
			// let's just try reading from the keyboard
			byte bArray[] = new byte[128];
			System.out.println("Enter something:");

			// the following reads in an array of bytes
			System.in.read(bArray);

			// convert the array into a String before attempting
			// to output it
			String s = new String(bArray, 0);
			System.out.println(s);
		} catch (IOException ioe) {
			System.out.println(ioe.toString());
			ioe.printStackTrace();
		}
	}
}
