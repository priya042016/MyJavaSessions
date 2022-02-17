package OOP_Inheritance;

public class CarTest {

	public static void main(String[] args) {
			BMW b=new BMW();
			b.start();//overridden
			b.stop();//inherited
			b.refuel();//inherited
			b.autoparking();//individual method
			BMW.price();// access static method with respective class name. if BMW wants to access can give BMW class
			b.engine();//inherited from direct parent car class
			b.automobile();//inherited
			b.name="520d";//accessing car class variable
			System.out.println(b.name);
			System.out.println(Car.wheels);//should use class name to access static variables
			System.out.println(BMW.wheels);//child class can also access static variables using class name
			b.areaOfSquare();
						
			
			Car c=new Car();
			c.start();
			c.stop();
			c.refuel();
			Car.price();//access using Car class
			c.engine();
			
			
			System.out.println("____________________________");
			
		//Top casting	(child object referred by parent object reference variable). here c1 can access only inherited and overridden methods. not the individual 
			//method of child.
			
			Car c1=new BMW();//Top Casting
			c1.start();//BMW start()--overridden method
			c1.stop(); //Car stop()--inherited method
			c1.refuel();//Car refuel()---inherited method
			Car.price(); //Car Price()------static method
			//c1.autoparking()//cannot access.. individual method of BMW class
			c1.engine();// overridden method defined in Car class
			
			
			
			//Top casting with grand parent
			Vehicle v1=new BMW();
			v1.engine();//only inherited method can be accessed
			v1.model();//vehicle individual method
			//v1.start()//cannot be accessed
			
			//Down casting gives compile time error. not possible
			
			//BMW b2=new Car();//cannot convert from Car to BMW// gives compile time error
			//BMW b3=(BMW) new Car();//gives ClassCastException during runtime
			//BMW b4=(BMW) new Vehicle();//gives ClassCastException during runtime
			
							
			

	}

}
