import java.util.Scanner;

public class String23 {
	static String replace(String s,char new_char,char old_char) {
		Object str = null;
		//converting string to array
		char[] s1=toCharArray(str);
		for(int i=0;i<s1.length;i++) {
			if (s1[i] == old_char) {
				s1[i]=new_char;
			}
			
		}
		//Converting array to string
		return new String (s1);
	}
	private static char[] toCharArray(Object str) {
		// TODO Auto-generated method stub
		return null;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		char new_char=scan.next().charAt(0);
		char old_char=scan.next().charAt(0);
		
		System.out.println(replace(s,new_char,old_char));
		
	}

}
