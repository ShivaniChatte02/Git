
public class NumberOfWords1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str="Hi! Good Morning";
		
		int count = 1;
		for(int i=0;i<str.length()-1;i++) {
			if((str.charAt(i) == ' ')&& (str.charAt(i+1) != ' ') ) {
				count ++;
			}
	    }
		System.out.println("Numbers of words in a string : " +count);

	}

}
