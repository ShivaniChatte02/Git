
public class Strings1 {
	public static void processWord(String s) {
		char c = getLastLetter(s);
		System.out.println(c);
	}
	
	public static char getLastLetter(String s) {
		int index = s.length()-1; 
		char c = s.charAt(index);
		return c;
	}
		
	public static void main(String[] args) {
		 processWord("banana");
	}
}
