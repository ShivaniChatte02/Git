import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Files7 {
	public static void main(String[] args) throws IOException {
		//for writing files
		String path="C:\\Users\\Admin\\eclipse-workspace\\Startproject\\Firstproject\\src\\Demo.txt";
		Scanner scan=new Scanner(System.in);
		FileWriter writer=null;
		try{
			String s1=scan.next();
			String s2=scan.next();
			String s3=scan.next();
			writer = new FileWriter(path);
			writer.write(s1);
			writer.write(s2);
			writer.write(s3);
			writer.flush();
		}catch(IOException e) {
			e.printStackTrace();
	    }
		finally {
			scan.close();
		    writer.close();
		}
	}
}
