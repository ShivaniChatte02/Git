import java.util.ArrayList;

public class Collection7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al);
		System.out.println(al.contains(30));
		System.out.println(al.contains(100));
		ArrayList b=new ArrayList();
		b.add(10);
		b.add(20);
		b.add(30);
		b.add(40);
		b.add(50);
		System.out.println(b);
		System.out.println(al.containsAll(b));
		System.out.println(al.getClass());
		System.out.println(b.getClass());
		
		
	}

}
