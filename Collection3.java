//for removing data
import java.util.ArrayList;

public class Collection3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al);//[10,20,30,40,50]
		al.remove(3);
		System.out.println(al);//[10,20,30,50]
		al.remove(new Integer(50));
		System.out.println(al);//[10,20,30]
		ArrayList b=new ArrayList();
		b.add(10);
		b.add(20);
		System.out.println(b);//[10,20]
		al.removeAll(b);//remove same value in al and b 
		System.out.println(al);//[30]
		al.clear();//clearing arraylist
		System.out.println(al);//[]
	}

}
