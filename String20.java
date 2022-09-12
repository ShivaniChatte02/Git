import java.util.Scanner;

public class String20 {
	static boolean endsWith(String s,String t) {
		int count=0;
		for(int i=s.length()-t.length();i<s.length();i++) {
			if(s.charAt(i)==t.charAt(count)) {
				count ++;
			}
		}
		if(t.length() == count) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		String t=scan.next();
		
		System.out.println(endsWith(s,t));

	}

}
