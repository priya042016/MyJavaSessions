package AccessModifiers;

public class Company {

	public static void main(String[] args) {
		//same package non sub class
		
		Employee emp=new Employee();
		emp.name="sree"; //public
		emp.dob="01/01/1587";//protected
		emp.city="mumbai";//default
		emp.m1();//public
		emp.m3();//protected
		emp.def();//default method
				
		
		

	}

}
