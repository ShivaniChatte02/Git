import java.util.Arrays;
import java.util.List;

public class NoOfOccur {

	public static void main(String[] args) {
		//Create a list of string
		List<String> list =Arrays.asList("Hi","Hello","Hi!Hello");
		//Taking string to find number of occurrences in a list
		String s="Hi";
		
		//Taking l variable for length of list
		int l=list.size();
		
		//Initialize count value
		int count=0;
		
		//Using For loop statement , for finding number of occurrences in a list
		for(int i=0;i<l;i++) {
			//Printing list of string 
		    System.out.println(list.get(i));
		    //If list of string contains required string ,then it will concatenate the count value and increase
		    if(list.get(i).contains(s)) {
		    	count = count + 1;
		    }
		
		}
		
		//Printing number of occurrences
		System.out.println("Total occurrences of string : " + count);

	}

}
