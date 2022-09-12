
public class Strings5 {
	public static void twoDigit(int number) {
		int lastdigit=number%10;
		int firstdigit=number/10;
		
		System.out.println(lastdigit+firstdigit);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=17;
		
		twoDigit(number);
	}

}
