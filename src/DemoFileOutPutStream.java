import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// read file from input.txt and write to output.txt
public class DemoFileOutPutStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream inputFile = null;
		FileOutputStream outputFile = null;
		//open file input
		try {
			inputFile = new FileInputStream("D:\\input.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Can't open file input");		}
		
		// open file output
		try {
			outputFile = new FileOutputStream("D:\\output.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Can't open file output");
		}
		// read and write
		int i = -1;
		try {
			while ((i = inputFile.read()) != -1) {
				outputFile.write(i);
			}
			// close file
			inputFile.close();
			outputFile.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
