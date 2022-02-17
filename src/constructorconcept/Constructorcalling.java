package constructorconcept;

public class Constructorcalling {
	String name;
	int age;
	//double salary;
	//right click , select source and select 'Generate constructor using fields option' to create constructors using different parameters:
	
	public Constructorcalling() {//cannot be static, final and abstract..only public, protected & private are permitted
		System.out.println("default constructor");
	}
	
	public Constructorcalling(String name) {
		//super();
		this.name = name;
	}

	
	public Constructorcalling(String name, int age) {
		//super();
		this("suba");//calling the above constructor with name
		//this.name = name;//this will give Priya
		this.age = age;
	}
	



	public static void main(String[] args) {
		
		//Constructorcalling c=new Constructorcalling("Priya", 30);
		Constructorcalling c=new Constructorcalling();
		
//		System.out.println(c.name);
//		System.out.println(c.age);
		
	}
	

}
