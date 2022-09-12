import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Files17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="C:\\Users\\Admin\\eclipse-workspace\\Startproject\\Firstproject\\src\\Data.txt";
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		float f=scan.nextFloat();
		boolean b=scan.nextBoolean();
		PrintWriter writer=null;
		
		try {
			writer = new PrintWriter(path);
			writer.println(n);
			writer.println(f);
			writer.println(b);
			writer.flush();
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
