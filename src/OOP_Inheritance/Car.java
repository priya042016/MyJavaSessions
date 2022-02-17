package OOP_Inheritance;

public class Car extends Vehicle{
	
	String name;
	public static int wheels=4;
	
	public void start(){
		System.out.println("Car---------start");
	}
	public void stop() {
		System.out.println("Car-----------stop");
			
	}
	public void refuel() {
		System.out.println("Car-------------------------refuel");
	}
	
	public static void price() {
		System.out.println("Car-------------------price");
	}
	@Override
	public void engine() {
		System.out.println("Car---------------------engine");
	}
	
	public void areaOfSquare() {
			int a=2;
			System.out.printf("Area of square with side 2 = %d%n", a*a);
			System.out.println();
	}

}
