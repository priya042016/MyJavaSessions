package AccessModifiers;

public class QA extends Employee{

	public static void main(String[] args) {
		
		//same package and sub class
		
		QA q=new QA();
		q.name="Priya";
		q.dob="01/04/1985";
		q.city="Bangalore";
		System.out.println(q.name);
		q.m1();//public method
		q.m3();//protected method
		//m2 private not accessible
		q.def();//default method
		
		

	}

}
