
/* The program may not represent the best way on file manipulation
 * 
 */

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIO {
	public static void main(String[] args) {
		try {
			// open args[0] for input
			FileInputStream in = new FileInputStream(args[0]);

			// add buffering to that InputStream
			BufferedInputStream bin = new BufferedInputStream(in);

			// open args[1] for output and add buffering to
			// it as well
			FileOutputStream out = new FileOutputStream(args[1]);
			BufferedOutputStream bout = new BufferedOutputStream(out);

			// now read as long as there is something to read
			byte bArray[] = new byte[256];
			int bytesRead;
			while (bin.available() > 0) {
				// read up a block - remember how many bytes read
				bytesRead = bin.read(bArray);

				// write that many bytes back out starting
				// at offset 0 in the array
				bout.write(bArray, 0, bytesRead);
			}
			bout.flush();
			bout.close();
			bin.close();
		} catch (IOException ioe) {
			System.out.println(ioe.toString());
		}
	}
}
