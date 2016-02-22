import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

// read file from input.txt
public class DemoBufferedInputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStream inputFile = null;
		BufferedInputStream bis = null;
		try {
			// open input stream
			inputFile = new FileInputStream("D:\\input.txt");

			// convert to BufferedInputStream
			bis = new BufferedInputStream(inputFile);
			// read number of bytes available
			int byteRead = bis.available();
			// create a byte[]
			byte[] buf = new byte[byteRead];
			bis.read(buf);
			// read
			for (byte b : buf) {
				System.out.print((char) b);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// close InputStream and BufferedInputStream
			bis.close();
			inputFile.close();
		}
	}

}
