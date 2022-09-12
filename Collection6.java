//if we have know present size  of an arraylist
import java.util.ArrayList;

public class Collection6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		System.out.println(al.size());//0
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al);
		System.out.println(al.size());//5
		al.trimToSize();//trim method is used to trim the size of arraylist (capacity reduce ,size remain same)
		System.out.println(al);//[10,20,30,40,50]
		System.out.println(al.size());
		

	}

}
