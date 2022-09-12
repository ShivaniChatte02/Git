import java.util.Scanner;

public class LowerClass {
	static String toLowerClass(String s) {
		String t="";
		
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c>='A' && c<='Z') {
				t=t+(char)(c+32);
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
		String s=scan.next();
		
		System.out.println(toLowerClass(s));

	}

}
