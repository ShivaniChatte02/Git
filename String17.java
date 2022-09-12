import java.util.Scanner;

public class String17 {
	static char[] toCharArray(String s) {
		char[] c=new char[s.length()];
		
		for(int i=0;i<s.length();i++) {
			c[i]=s.charAt(i);
		}
		return c;
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		
		System.out.println(toCharArray(s));
		

	}

}
