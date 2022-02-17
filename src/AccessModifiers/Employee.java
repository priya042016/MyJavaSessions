package AccessModifiers;

public class Employee {
	
	public String name;
	private int salary;
	String city;//default
	protected String dob;
	
	public void m1() {
		System.out.println("public m1");
		
	}
	private void m2() {
		System.out.println("private m2");
		
	}
	protected void m3() {
		System.out.println("protected m3");
		
	}
	
	void def() {
		System.out.println("default method");
	}
	//default methods are allowed only in interfaces
	
	public static void main(String[] args) {
		//inside the same class
		
		Employee e=new Employee();
		e.name="Tom";
		e.salary=1254522;
		e.city="Mumbai";
		e.dob="02/02/1990";
		System.out.println(e.name);
	}

}
