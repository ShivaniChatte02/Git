package Data;

public class Recursion3 {
		public static void checkFermat(int a,int b,int c,int n){
			if(n>2){
				System.out.println("Holy smokes"+ ","+"Fermat was wrong"+"!");
			}
			else{
				System.out.println("No"+","+"that doesn"+"’"+"t"+""+"work"+".");
			}
		}
		public static void raiseToPow(int a,int b){
			double x=Math.pow(a,b);
			System.out.println(x);
		}
public static void main(String[] args){
			int a=2;
			int b=3;
			int c=2;
			int n=1;

			checkFermat(a,b,c,n);
	        raiseToPow(a,b);
		}
	
}
