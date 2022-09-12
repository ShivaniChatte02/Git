import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Files10 {

	public static void main(String[] args) {
		//for writing from this file to other file(the data is write in new file from first file(it will copy all data))
		String path="C:\\Users\\Admin\\eclipse-workspace\\Startproject\\Firstproject\\src\\Demo.txt";
		String path2="C:\\Users\\Admin\\eclipse-workspace\\Startproject\\Firstproject\\src\\newDemo.txt";
		FileReader reader=null;
		FileWriter writer=null;
		try {
			reader=new FileReader(path);
			writer=new FileWriter(path2);
			int c=reader.read();
			
			while(c!=-1) {
				writer.write(c);
				c=reader.read();
			}
			writer.flush();
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}


	}

}
