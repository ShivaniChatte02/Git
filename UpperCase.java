import java.util.Scanner;

public class UpperCase {
	static String toUpperCase(String s) {
		
		String t= "" ;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c>='a' && c<='z') {
				t=t+(char)(c-32);
			}
			else {
				t=t+c;
			}
			
		}
	    return t;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		
		System.out.println(toUpperCase(s));
		
		
	}

}
