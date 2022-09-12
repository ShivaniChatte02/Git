import java.util.Scanner;

class Circle{
	private float r;
	static private float pi;
	private float a;
	
	static
	{
		pi=3.141f;
	}
	
	public void acceptInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a radius :");
		r=scan.nextFloat();
	}
	
	public void area()
	{
		a=pi*r*r;
	}
	
	public void displayArea() {
		System.out.println(a);
	}
}
public class Demo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1=new Circle();
		c1.acceptInput();
		c1.area();
		c1.displayArea();
		
		Circle c2=new Circle();
		c2.acceptInput();
		c2.area();
		c2.displayArea();
	}

}
