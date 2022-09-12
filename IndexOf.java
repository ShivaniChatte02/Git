import java.util.Scanner;

public class IndexOf {
	static int indexOf(String s,String c) {
		char key=c.charAt(0);
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		String c=scan.next();
		
		System.out.println(indexOf(s,c));

	}

}
