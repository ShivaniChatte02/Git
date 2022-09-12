import java.util.Scanner;

public class IndexOf2 {
	static int indexOf(String s,String c,int k) {
		char key=c.charAt(0);
		int count=0;
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)== key) {
				count ++;
			}
			if(count == k) {
				return i;
			}
			
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		//string
		String s=scan.nextLine();
		//character
		String c=scan.nextLine();
		//Occurence of character
		int k=scan.nextInt();
		
		System.out.println(indexOf(s,c,k));

	}

}
