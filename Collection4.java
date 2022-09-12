import java.util.ArrayList;

public class Collection4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al);//[10,20,30,40,50]
		ArrayList b=new ArrayList();
		b.add(10);
		b.add(20);
		System.out.println(b);//[10,20]
		al.retainAll(b);//this is using for retain means in arraylist al and b in which data is same that are print and otherb data get delete 
		System.out.println(al);//[10,20]

	}

}
