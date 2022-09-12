import java.util.Scanner;

public class invalidBracket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		
		int count=0,bracket=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c=='(') {
				bracket++;
			}else {
				if(bracket<=0) {
					count++;
				}
				else {
					bracket--;
				}
			}
		}
		System.out.println(bracket+count);

	}

}
