import java.util.StringTokenizer;

public class StringTokenizer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="JAVA PYTHON SQL AI";
		StringTokenizer st=new StringTokenizer(s," ");
		while(st.hasMoreTokens()==true) {
			System.out.println(st.nextToken());
		}
		
		

	}

}

