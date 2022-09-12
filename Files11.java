import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Files11 {

	public static void main(String[] args) {
		//FOR READING FILE 
		String path="C:\\Users\\Admin\\eclipse-workspace\\Startproject\\Firstproject\\src\\Demo.txt";
		FileReader reader=null;
		BufferedReader reader2=null;
		
		try {
			reader=new FileReader(path);
			reader2=new BufferedReader(reader);
			
			String line=reader2.readLine();
			while(line!=null) {
				System.out.println(line);
				line=reader2.readLine();
			}
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
