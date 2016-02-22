
public class Main {
 // call CreateNewFile and ListFile
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// call CreateNewFile to create file NewFile
		CreateNewFile createNewFile = new CreateNewFile();
		createNewFile.createNewFile();
		
		// call ListFile to print all file in fother D:\\dieu
		ListFile listFile = new ListFile();
		listFile.listFile();
	}
}
