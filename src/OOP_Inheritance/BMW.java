package OOP_Inheritance;

public class BMW extends Car {
	
	
	
	//overridden method
		@Override
		public void start(){
			System.out.println("BMW---------start");
		}
		
		//individual method		
		public void autoparking() {
			System.out.println("BMW----------------------autoparking");
		
		}
		
		//Method hiding. we can call the same static method of parent in child. this is called method hiding.
		public static void price() {
			System.out.println("BMW-------------------price");
		}
		
		@Override
		public void areaOfSquare() {
			int a=4;
			System.out.printf("Area of square with side 4 = %d%n", a*a);
			System.out.println();
			}
		
		
}