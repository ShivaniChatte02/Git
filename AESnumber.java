import java.util.Scanner;

public class AESnumber {
	static boolean isAesNumber(int n) {
		int count=0;
		for(int i=0;i<=n;i++) {
			if(n%i == 0) {
				count++;
			}
		}
		
		if(count==4) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		int l=scan.nextInt();
		int r=scan.nextInt();
		int aes=0;
		
		for(int i=l;i<=r;i++) {
			if(isAesNumber(i)==true) {
				aes++;
			}
		}
		System.out.println(aes);

	}

}
