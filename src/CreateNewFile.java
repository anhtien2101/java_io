import java.io.File;

// create new file
public class CreateNewFile {
	public void createNewFile(){
		String path = "D:\\CreateFile/NewFile";
		File f = new File(path);
		// create file
		f.mkdirs();
	}
}
