import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Files6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="C:\\Users\\Admin\\eclipse-workspace\\Startproject\\Firstproject\\src\\Demo.txt";
		File file=new File(path);
		Scanner scan=new Scanner(System.in);
		FileWriter writer ;
		try{
			String s1=scan.next();
			String s2=scan.next();
			String s3=scan.next();
			writer = new FileWriter(file); 
			//for appending use true
//			writer = new FileWriter(file,true);
			writer.write(s1);
			writer.write(s2);
			writer.write(s3);
			writer.flush();
		}
		catch(IOException e) {
			e.printStackTrace();
		}


	}

}
