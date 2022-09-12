import java.util.Scanner;

public class DivisibleSumpair {
	
	static int divisibleSumPairs(int[] arr,int k) {
		int count=0;
		
		System.out.println("The number of pairs :");
		for(int i= 0 ;i<arr.length-1;i++) {
			for(int j=i+1 ;j<arr.length;j++) {
				if((arr[i]+arr[j])%k==0) {
					count++;
				}
			}
		}
		return count;
	
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("The value of n :");
		int n=scan.nextInt();
		System.out.println("The value of k :");
		int k=scan.nextInt();
		
		int[] arr=new int[n];
		
		System.out.println("The arrays are :");
		for(int i=0 ;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println(divisibleSumPairs(arr,k));
	}
}

