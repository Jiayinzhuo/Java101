import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class FileIO2 {
	public static void main(String[] args) {
		try {
			// use a normal input stream for bulk input
			FileInputStream in = new FileInputStream(args[0]);
			BufferedInputStream bin = new BufferedInputStream(in);

			// create a buffered print stream for output
			FileOutputStream out = new FileOutputStream(args[1]);
			BufferedOutputStream bout = new BufferedOutputStream(out);
			PrintStream pout = new PrintStream(bout);

			// read up 8 bytes at a time
			byte bArray[] = new byte[8];
			int bytesRead;
			while (bin.available() > 0) {
				// first output them as hex numbers
				bytesRead = bin.read(bArray);
				for (int i = 0; i < bytesRead; i++) {
					int nByte = (int) bArray[i];
					String s = Integer.toString(nByte, 16);
					if (s.length() == 1) {
						pout.print(" ");
					}
					pout.print(s + ", ");
				}

				// then, if they are printable output the
				// character (if not, output a ".")
				pout.print("-");
				for (int i = 0; i < bytesRead; i++) {
					char c = (char) bArray[i];
					if (Character.isDigit(c) || Character.isLowerCase(c) || Character.isUpperCase(c)) {
						// retain c -- do nothing
					} else {
						c = '.'; // replace with a "."
					}
					pout.print(c);
				}
				pout.println(" ");
			}
			bout.flush();
			bout.close();
			bin.close();
		} catch (IOException ioe) {
			System.out.println(ioe.toString());
		}
	}
}
