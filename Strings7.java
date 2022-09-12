
public class Strings7 {
	public static boolean ispalindrome(String s) {
		String rev ="" ;
		
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		
		
		if(s.toUpperCase().equals(rev.toUpperCase())) {
			return true; 
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Radar";
		
		ispalindrome(s);
	}

}
