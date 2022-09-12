
public class Strings6 {
	public static void first(String s) {
	   char ch=s.charAt(0);
	   System.out.println(ch);
	}
	public static void last(String s) {
		int len =s.length();
		
		char ch=s.charAt(len-1);
		System.out.println(ch);
	}
	public static void middle(String s) {
		int len=s.length()-1;
		String s1=s.substring(1, len);
		System.out.println(s1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="letter";
		
		first(s);
		last(s);
		middle(s);
	}

}
