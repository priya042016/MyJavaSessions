package AccessMod2;

import AccessModifiers.Employee;

public class Dev extends Employee {

	//different package sub class
	public static void main(String[] args) {
		
		Dev d=new Dev();
		d.name="Ravi";//public
		d.dob="01/01/1545";//protected
		//d.city//default not accessible
		d.m1();//public
		d.m3();//protected
		//d.def//default method(non accessible)
		
	}

}
