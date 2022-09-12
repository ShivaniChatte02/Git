import java.util.Scanner;

public class String22 {
	static boolean contains(String s,String t) {
		int count=0;
		for(int i=0;i<s.length() && count<t.length();i++) {
			if(s.charAt(i)==t.charAt(count)) {
				count++;
			}else {
				count=0;
			}
		}
		if(t.length()==count) {
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
		
		System.out.println(contains(s,t));

	}

}
