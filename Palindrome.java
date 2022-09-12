import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		
		if(s.equalsIgnoreCase(rev)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		

	}

}
