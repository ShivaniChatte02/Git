import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Files13 {

	public static void main(String[] args) {
		//for counting char in each line
		String path="C:\\Users\\Admin\\eclipse-workspace\\Startproject\\Firstproject\\src\\Demo.txt";
		FileReader reader=null;
		BufferedReader reader2=null;
		int count=0;
		int sum=0;
		
		try {
			reader=new FileReader(path);
			reader2=new BufferedReader(reader);
			
			String line=reader2.readLine();
			while(line!=null) {
				count++;
				int l=line.length();
				sum=sum+l;
				line=reader2.readLine();
			}
			System.out.println(count);
			System.out.println(sum);
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
