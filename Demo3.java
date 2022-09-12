class Car2{
	private String name;
	private int mileage;
	private int cost;
public Car2() {
	name="Ferrai";
	mileage=10;
	cost=800000;
				
}
public Car2(String name,int mileage,int cost) {
	this();
	this.name=name;
	this.mileage=mileage;
	this.cost=cost;
	
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
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car2 car=new Car2("BMW",180, 8000000);
		System.out.println(car.getName());
		System.out.println(car.getMileage());
		System.out.println(car.getCost());
	}

}
