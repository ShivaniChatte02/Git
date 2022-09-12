import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListStringtoInteger {

	public static void main(String[] args) {
		List<String> list=Arrays.asList("1","2","3");
		List<Integer> newList=new ArrayList<>();
		
		int l=list.size();
		
		for(int i=0;i<l;i++) {
			String s=list.get(i);
			newList.add(Integer.parseInt(s));
//			newList.add(Integer.valueOf(s));
		}
		System.out.println("List of Integer : "+ newList);
		}

}
