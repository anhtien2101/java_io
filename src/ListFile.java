import java.io.File;

public class ListFile {

	public void listFile(){
		File file = null;
		String[] arrayFile = null;
		file = new File("D:\\dieu");
		arrayFile = file.list();
		for (int i = 0;i < arrayFile.length;i++) {
			System.out.println(arrayFile[i] + "\n");
		}
	}
}
