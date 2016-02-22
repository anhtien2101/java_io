import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DemoFileInputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream file = null;
		try {
			// Create new FileInputStream
			file = new FileInputStream("D:\\input.txt");
			// read file
			int i;
			while ((i = file.read()) != -1) {
				System.out.print((char)i);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File Not Found");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error when read file");
		} finally {
			//close file
			if (file != null) {
				file.close();
			}
		}
	}
}
