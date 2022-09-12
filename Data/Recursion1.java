package Data;

import java.util.Scanner;

public class Recursion1 {
	public static void printMultiples(int n,int high) {
		int i=1;
		while(i<=high) {
			System.out.print(n*i+"   ");
			i=i+1;
		}
		System.out.println("");
	}
	
	public static void printMultTables(int high) {
		int i=1;
		
		while(i<=high) {
			printMultiples(i,i);
			i=i+1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printMultTables(6);
		
	}

}
