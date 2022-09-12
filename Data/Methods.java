package Data;

import java.util.Scanner;

public class Methods {
	public static void printAmerican(String day,int date,String month,int year) {
		System.out.print(day + ",");
		System.out.print(month + " "  + date+","  );
		System.out.println(year);
	}
	
	public static void printEuropean(int date,String month,int year) {
		System.out.print(date+" ");
		System.out.print(month+" ");
		System.out.println(year);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String day=scan.nextLine();
		int date=scan.nextInt();
		int year=scan.nextInt();
		String month=scan.nextLine();
		
		
		printAmerican(day,date,month,year);
		printEuropean(date,month,year);
		
	}

}
