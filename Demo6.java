class Test{
	static int a,b;
	static
	{
		System.out.println("Inside static block");
		a=10;
		b=20;
	}
	static void fun1() {
		System.out.println("Inside static function");
	}
	int x,y;
	{
		System.out.println("Inside non-static block");
	}
	static void fun2() {
		System.out.println("Inside non-static function");
	}
	Test(){
		System.out.println("Inside constructor");
		x=30;
		y=40;
	}
}
public class Demo6 {

	public static void main(String[] args) {
		Test.fun1();
		Test t=new Test();
		t.fun2();

	}

}
