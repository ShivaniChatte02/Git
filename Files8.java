import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Files8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for reading file
		String path="C:\\Users\\Admin\\eclipse-workspace\\Startproject\\Firstproject\\src\\Demo.txt";
		FileReader reader=null;
		char ar[]=new char[15];
		
		try {
			reader = new FileReader(path);
			System.out.println(reader.read(ar));
			System.out.println(ar);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
