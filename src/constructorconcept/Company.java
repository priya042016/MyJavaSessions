package constructorconcept;

import java.util.ArrayList;

public class Company {
	
	String name;//default null
	int empCount;//default 0
	ArrayList<String> catlist;//default 0
	double shareprice;//default 0.0
	boolean isFunded;//default false
	//function
	public String companyinfo(String name) {
		System.out.println("getting company info");
		return name;
	}
	
	//constructors with different parameters
	public Company(String name) {
		this.name=name;
	}
	
	public Company(String name, int empCount) {
		this.name=name;
		this.empCount=empCount;
	}
	
	public Company(String name, int empCount, ArrayList<String> catlist, boolean isFunded) {
		this.name=name;
		this.empCount=empCount;
		this.catlist=catlist;
		this.isFunded=isFunded;
	}

}
