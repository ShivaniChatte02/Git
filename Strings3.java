
 public class Strings3 {
	public static void countLetter(String s) {
		int count=0;
		int len=s.length();
		int i=0;
		
		while(i<len) {
			if(s.charAt(i) == 'a') {
				count=count+1;
			}
			i =  i+1;
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="letter";
		countLetter(s);
	}

}
