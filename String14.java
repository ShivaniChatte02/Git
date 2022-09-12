
public class String14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Case 2
		String s1="SHANAYA";
		String s2="SHIVANI";
		
		int result = s1.compareTo(s2);
		if(result==0) {
			System.out.println("Both strings are equal");
		}
		
		else if(result>0) {
			System.out.println("String1  are greater than String2");
		}
		
		else {
			System.out.println("String1  are lesser than String2");
		}
	}

}
					