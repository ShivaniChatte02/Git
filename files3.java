import java.io.File;

public class files3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="C:\\Users\\Admin\\eclipse-workspace\\Startproject\\Firstproject\\src";
		File file=new File(path);
		//displaying file contains in the directory
		String[] src = file.list();
		for(String s : src) {
			System.out.println(s);
		}
	}

}
