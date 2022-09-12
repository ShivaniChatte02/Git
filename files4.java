import java.io.File;

public class files4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for deleting file
//		String path="C:\\Users\\Admin\\eclipse-workspace\\Startproject\\Firstproject\\src\\B.java";
		
		//for deleting directory
		String path="C:\\Users\\Admin\\eclipse-workspace\\Startproject\\Firstproject\\src\\Java";
		File file=new File(path);
		file.delete();
	}

}
