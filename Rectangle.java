
public class Rectangle {
	float area(int l,float b) {
		return l*b;
	}
	
	double area(double l,double b) {
		return l*b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle ref=new Rectangle();
		int a=10,b=20;
		System.out.println(ref.area(a, b));		

	}

}
