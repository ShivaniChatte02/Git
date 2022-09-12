class Car{
	private String name;
	private int mileage;
	private int cost;
	
	public Car(String name,int mileage,int cost) {
		//Use "this" keyword to resolving shadowing problem
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
public class Demo1 {

	public static void main(String[] args) {
		Car car=new Car("BMW",180, 8000000);
		System.out.println(car.getName());
		System.out.println(car.getMileage());
		System.out.println(car.getCost());

	}

}
