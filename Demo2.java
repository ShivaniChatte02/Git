class Car1{
	private String name;
	private int mileage;
	private int cost;
public Car1() {
	name="Ferrai";
	mileage=10;
	cost=800000;
				
}
public Car1(String name,int mileage,int cost) {
	this();
}
public String getName() {
	return name;
}

public int getMileage() {
return mileage;
}

public int getCost() {
return cost;
}
}		
		
public class Demo2 {

	public static void main(String[] args) {
		
				Car1 car=new Car1("BMW",180, 8000000);
				System.out.println(car.getName());
				System.out.println(car.getMileage());
				System.out.println(car.getCost());
	}

}
