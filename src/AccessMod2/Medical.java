package AccessMod2;

import AccessModifiers.Employee;

public class Medical {

	//different package non sub class
	public static void main(String[] args) {
		 
		Employee emp=new Employee();
		emp.name="test";//public
		//only public is accessible
		emp.m1();//public
		//emp.def//default method not accessible

	}

}
