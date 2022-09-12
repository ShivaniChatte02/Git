import java.io.File;
import java.io.IOException;

public class files1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="C:\\Users\\Admin\\eclipse-workspace\\Startproject\\Firstproject\\src\\Data.txt";
		File file=new File(path);
		//for creating new file
		try {
			file.createNewFile();
		}
		catch(IOException e){
			e.printStackTrace();
		}

	}

}
