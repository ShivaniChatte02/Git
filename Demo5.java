class Car4{
	private String name;
	private int mileage;
	private int cost;

public Car4(String name,int mileage,int cost) {
	this.name=name;
	this.mileage=mileage;
	this.cost=cost;
}
public Car4() {

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
public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car4 car1=new Car4("BMW",180, 8000000);
		System.out.println(car1.getName());
		System.out.println(car1.getMileage());
		System.out.println(car1.getCost());
		
		Car4 car2=new Car4();
		System.out.println(car2.getName());
		System.out.println(car2.getMileage());
		System.out.println(car2.getCost());
	}

}
