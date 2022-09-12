class Car3{
	private String name;
	private int mileage;
	private int cost;
public Car3() {
	name="Ferrai";
	mileage=10;
	cost=800000;
				
}
public Car3(String name,int mileage,int cost) {
	this(name);
}
public Car3(String name) {
	this();
	this.name=name;
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
public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car3 car=new Car3("BMW",180, 8000000);
		System.out.println(car.getName());
		System.out.println(car.getMileage());
		System.out.println(car.getCost());
	}

}
