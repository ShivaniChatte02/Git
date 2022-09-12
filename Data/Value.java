package Data;
import java.util.Scanner;
public class Value {
    public static boolean isDivisible(int n,int m){
		if(n % m == 0){
	       return true;
		}
		return false;
	}
public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int m=scan.nextInt();
			
	isDivisible(n,m);
}
}

