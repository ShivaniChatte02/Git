import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Files14 {
	public static void main(String[] args) {
		//for merging two files together
		String path1="C:\\Users\\Admin\\eclipse-workspace\\Startproject\\Firstproject\\src\\Names.txt";
		String path2="C:\\Users\\Admin\\eclipse-workspace\\Startproject\\Firstproject\\src\\Phonenumbers.txt";
		FileReader fr1=null;
		BufferedReader br1=null;
		FileReader fr2=null;
		BufferedReader br2=null;
		
		try {
			fr1=new FileReader(path1);
			br1=new  BufferedReader(fr1);
			fr2=new FileReader(path2);
			br2=new BufferedReader(fr2);
			
			String name=br1.readLine();
			String phonenumber=br2.readLine();
			
			while(name != null) {
				System.out.println(name+" : "+phonenumber);
				name=br1.readLine();
				phonenumber=br2.readLine();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
