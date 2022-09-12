
public class String16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ShivaniChatte";
		String s1="Shivani Chatte";
		//fOR Converting lowercase to uppercase
		System.out.println(s.toUpperCase());
		System.out.println(s1.toUpperCase());
		//for converting uppercase to lowercase
		System.out.println(s.toLowerCase());
		System.out.println(s1.toLowerCase());
		//checking starting with 
		System.out.println(s.startsWith("s"));
		//checking ending with 
	    System.out.println(s.endsWith("e"));
	    //checking index of character
	    System.out.println(s.indexOf("e"));
	    System.out.println(s1.indexOf("e"));
	    //checking character at
	    System.out.println(s.charAt(12));
	    //checking string contains or not
	    System.out.println(s.contains("vani"));
	    //getting substring 
	    System.out.println(s.substring(0,7));//(s.substring(start,(end+1)-1)
	    //getting substring 
	    System.out.println(s.substring(7));//(s.substring(start)
	    
				
		}

}
