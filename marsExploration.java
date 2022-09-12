import java.util.Scanner;

public class marsExploration {
	static int marsExploration(String s) {

		int count=0;
		for(int i=0;i<s.length();i=i+3) {
			char c=s.charAt(i);
			if(c!='S') {
				count++;
			}
			if(c!='O') {
				count++;
			}
			if(c!='S') {
				count++;
			}
			
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		
		System.out.println(marsExploration(s));
	}

}
