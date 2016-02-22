import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
// write to file output1.txt
public class DemoBufferedOutputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		OutputStream ost = null;
		BufferedOutputStream bos = null;
		try {
			// open outputStream to write
			ost = new FileOutputStream("D:\\output1.txt");
			// convert outputStream to BufferedOutputStream
			bos = new BufferedOutputStream(ost);
			// create a String and convert to byte[]
			String str = "Hello 2016";
			byte[] bytes = str.getBytes();
			// write to output1.txt
			bos.write(bytes);
			bos.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// close
			ost.close();
			bos.close();
		}
	}

}
