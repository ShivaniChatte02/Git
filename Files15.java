import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Files15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for storing two files  in other new files 
		String path1="C:\\Users\\Admin\\eclipse-workspace\\Startproject\\Firstproject\\src\\Names.txt";
		String path2="C:\\Users\\Admin\\eclipse-workspace\\Startproject\\Firstproject\\src\\Phonenumbers.txt";
		String path3="C:\\Users\\Admin\\eclipse-workspace\\Startproject\\Firstproject\\src\\Phonebook.txt";
		FileReader fr1=null;
		BufferedReader br1=null;
		FileReader fr2=null;
		BufferedReader br2=null;
		FileWriter writer=null;
		
		try {
			fr1=new FileReader(path1);
			br1=new  BufferedReader(fr1);
			fr2=new FileReader(path2);
			br2=new BufferedReader(fr2);
			writer=new FileWriter(path3);
			
			String name=br1.readLine();
			String phonenumber=br2.readLine();
			
			while(name != null) {
				System.out.println(name+" : "+phonenumber);
				writer.write(name+" : "+phonenumber+"\n");
				name=br1.readLine();
				phonenumber=br2.readLine();
			}
			writer.flush();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
