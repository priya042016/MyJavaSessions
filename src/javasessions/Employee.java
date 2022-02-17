package javasessions;

public class Employee {
	//class properties or class variables/global variables
	
	String name;
	int age;
	double salary;
	
	public static void main(String[] args) {
	
		
		Employee e1= new Employee();
		e1.name="Priya";
		e1.age=28;
		e1.salary=23.33;
			
		Employee e2=new Employee();
		e2.name="Sneha";
		e2.age=27;
		e2.salary=24.33;
		
		Employee e3=new Employee();
		e3.name="Goki";
		e3.age=24;
		e3.salary=20.33;
		
		System.out.println(e1.name+" "+e1.age+" "+e1.salary);//if no values are assigned, gives default values name= null, age=0, salary=0.0
		e1=e2;
		System.out.println(e1.name+" "+e2.name+" "+e3.name);
		e2=e3;
		System.out.println(e1.name+" "+e2.name+" "+e3.name);
		e3=e1;
		System.out.println(e1.name+" "+e2.name+" "+e3.name);
		
//		Employee e4=new Employee();
//		e4=null;
//		System.out.println(e4.name);// java.lang.NullPointerException:
		

	}

}
