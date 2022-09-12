
//Built-in methods 
//for adding data 
import java.util.ArrayList;
public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		System.out.println(al);
		al.add(2,200);
		//////(index Positon,value add after the position)
		System.out.println(al);
		ArrayList b = new ArrayList();
		b.add(100);
		b.add(200);
		b.add(300);
		b.add(400);
		System.out.println(b);
		al.addAll(b);//merging arraylist use this 
		System.out.println(al);
		al.addAll(2,b);//(position,value of arraylist add after the position)
		System.out.println(al);
		
	}

}
