import java.util.Scanner;

public class String19 {
	static boolean startsWith(String s,String t) {
		int count=0;
		for(int i=0;i<t.length();i++) {
			if(s.charAt(i)==t.charAt(count)) {
				count ++;
			}
		}
		if(t.length()==count) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		String t=scan.next();
		
		System.out.println(startsWith(s,t));

	}

}
