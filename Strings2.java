
public class Strings2 {
	public static void Generalization(String s) {
		int length=s.length();
		int i=0;
		int count=0;
		
		while(i<length) {
			char c=s.charAt(i);
			
			if(c == '(') {
				count=count+1;
			}
			else if(c == ')') {
				count=count-1;
			}
			i=i+1;
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "((3 + 4) * 5)";
		
		Generalization(s);
	}

}
