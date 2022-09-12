import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Files12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for counting lines of data
		String path="C:\\Users\\Admin\\eclipse-workspace\\Startproject\\Firstproject\\src\\Demo.txt";
		FileReader reader=null;
		BufferedReader reader2=null;
		int count=0;
		
		try {
			reader=new FileReader(path);
			reader2=new BufferedReader(reader);
			
			String line=reader2.readLine();
			while(line!=null) {
				count++;
				line=reader2.readLine();
			}
			System.out.println(count);
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
