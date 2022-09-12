
public class String15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Case 3
				String s1="SHIVANI";
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
