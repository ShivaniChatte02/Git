package Data;

import java.util.Scanner;

public class Recursion {
	public static void bottles(int n) {
		if(n==0) {
			System.out.println("no bottles of beers");
		}
		else {
			System.out.println(n + " Bottles of beers");
			bottles(n-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner scan=new Scanner(System.in);
         int n=scan.nextInt();
         
         bottles(n);
	}

}
