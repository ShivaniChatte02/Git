package Data;

import java.util.Scanner;

public class StringBack {
    public static void backwardString(String s) {
    	String rev="";
    	
    	for(int i = s.length()-1;i>=0;i--) {
    		rev=rev+s.charAt(i);
    	}
    	System.out.print(rev);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		
		backwardString(s);
	}

}
