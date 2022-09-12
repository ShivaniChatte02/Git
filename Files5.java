import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Files5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="C:\\Users\\Admin\\eclipse-workspace\\Startproject\\Firstproject\\src\\Demo.txt";
		File file=new File(path);
		try{
			FileWriter writer = new FileWriter(file); 
			writer.write("Hello World");
			writer.flush();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
