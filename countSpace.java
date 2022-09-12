import java.util.Scanner;

public class countSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		
		int count=0;
		for(int i=0;i<s.length();i++) {
			count++;
		}
		System.out.println(count);

	}

}
