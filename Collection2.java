
//for retrieving data
import java.util.ArrayList;

public class Collection2 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al);//[10,20,30,40,50]
		System.out.println(al.get(2));//al.get(position)//30
		System.out.println(al.subList(0,4));//al.subList(start,end=(end+1)-1
		System.out.println(al.indexOf(30));//2
		al.add(30);
		System.out.println(al);//[10,20,30,40,50,30]
		System.out.println(al.lastIndexOf(30));//5

	}

}
