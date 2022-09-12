
public class QuizString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch[]= {'a','1','b',' ','A','0'};
		
		for(int i=0;i<5;++i) {
			if(Character.isDigit(ch[i])) 
			System.out.println(ch[i]+"is a digit");
	        if(Character.isWhitespace(ch[i])) 
			System.out.println(ch[i]+"is a whitespace character");
			if(Character.isUpperCase(ch[i])) 
			System.out.println(ch[i]+"is a Upper character");
			if(Character.isLowerCase(ch[i])) 
			System.out.println(ch[i]+"is a Lower character");
			i=i+3;
		}
		
		

	}

}
