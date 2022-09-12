import java.util.Scanner;

public class String21 {
	static String subString(String s,int startIndex) {
		String t="";
		for(int i=startIndex;i<s.length();i++) {
			t=t+s.charAt(i);
		}
		return t;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String  s=scan.next();
		int startIndex=scan.nextInt();
		
		System.out.println(subString(s,startIndex));

	}

}
