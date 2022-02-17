package Finalize;

public class Employee {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp=null;
		System.gc();
		
		System.out.println("this is inside Main of Employee");

	}
//finalize method will be executed by default if any null object reference is there and System.gc() is written.
	//its applicable only this class. not for other class's null object reference
	public void finalize(){
		System.out.println("thiis is finalize of -------Employee class");
	}
}
