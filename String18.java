import java.util.Scanner;

public class String18 {
	static boolean equals(String s1,String s2) {
		if(s1.length() !=s2.length()) {
			return false;
		}
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)!=s2.charAt(i)) {
				return false;
			}
		}
		return true;
		
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s1=scan.next();
		String s2=scan.next();
		
		System.out.println(equals(s1,s2));
		
	}

}
