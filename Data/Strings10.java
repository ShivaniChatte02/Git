package Data;

public class Strings10 {
	public static boolean isDupledrome(String s){
		if(s.length()%2!=0){
			return false;
		}
		
		int i=0;
		while(i<s.length()){
			if(s.charAt(i)!=s.charAt(i+1)){
				return false;
			}
			i=i+2;
		}
		return true;
	   }
	public static void main(String[] args){
		String s="sshhiivvaa";
		
		System.out.println(isDupledrome(s));
	}
}

	