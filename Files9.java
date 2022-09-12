import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Files9 {

	public static void main(String[] args) {
		//reading data from file
		String path="C:\\Users\\Admin\\eclipse-workspace\\Startproject\\Firstproject\\src\\Demo.txt";
		FileReader reader=null;
		try {
			reader=new FileReader(path);
			int c=reader.read();
			
			while(c!=-1) {
				System.out.print((char)c);
				c=reader.read();
			}
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
