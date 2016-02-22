import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class WriteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fileOutputStream = 
					new FileOutputStream("D:\\TestJava/printWriter.txt",true);
			PrintWriter pw = new PrintWriter(fileOutputStream);
			pw.print("Le ");
			pw.print("Thi ");
			pw.print("Anh ");
			pw.print("Tien ");
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
