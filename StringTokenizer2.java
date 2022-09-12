import java.util.StringTokenizer;

public class StringTokenizer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				String s="JAVA PYTHON SQL AI";
				StringTokenizer st=new StringTokenizer(s,"A");
				while(st.hasMoreTokens()==true) {
					System.out.println(st.nextToken());
				}
				
	}

}
