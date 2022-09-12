package Data;

public class Strings9 {
	public static boolean isAbecedarian(String s){
		int i=0;
		char c='a';
		
		while (i < s.length()) {
			if (c > s.charAt(i)) {
				return false;
			}
			c = s.charAt(i); 
			i = i + 1;
			
		}
		return true;
	}
	public static void main(String[] args){
		String s="abcdef";
		
		System.out.println(isAbecedarian(s));
	}
}

	