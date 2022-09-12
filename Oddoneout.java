import java.util.Scanner;

public class Oddoneout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
		
		System.out.println("The value of n :");
		int n=scan.nextInt();
		
//		int[] arr=new int[n-1];
		
		int sum=0;
//		System.out.println("The arrays are :");
		for(int i=0 ;i<n-1;i++) {
//			arr[i]=scan.nextInt();
			sum=sum+scan.nextInt();
			
		}
		
		int  s = n * ( 2 + (n-1) * 2) / 2;
		System.out.println(s);
//		
//		int sum=0;
//		for(int i=0;i<arr.length;i++) {
//			sum=sum+arr[i];
//		}
		System.out.println(sum);
		
		int mt= s-sum;
		System.out.println(mt);

	}

}
