
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
	
		//Creation 
		String path="C:\\Users\\Admin\\eclipse-workspace\\Startproject\\Firstproject\\src\\File.txt";
		File file=new File(path);
		String s=null;
		Scanner scan=new Scanner(System.in);
		
		try {
			Scanner f=new Scanner(file);
			System.out.print("Enter a word : ");
			String word=scan.next();
			int count=0;
			while(f.hasNext()) {
				s=f.next();
				if(s.equalsIgnoreCase(word)) {
					count++;
				}
			}
			System.out.println("Count of given words in a file : "+count);
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}