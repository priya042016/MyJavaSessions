package javasessions;

public class Student {
	
	//WAF
	//input: name (String)
	//Return type : Integer
	int marks;
	public int studentMarks(String name) {
		if (name.equalsIgnoreCase("priya")) {
			marks=90;
		 }
		else if (name.toLowerCase()==("hema")) {
			marks=95;
		}
		else {
			marks=-1;
			
		}
		return marks;
		
	}

	public static void main(String[] args) {
		Student m=new Student();
		int totalmarks=m.studentMarks("Priya");
		if (totalmarks>=80) {
			System.out.println(totalmarks);
			System.out.println("Grade A");
		}
		else {
			System.out.println("other grades");
		}
		int total =m.studentMarks("pramila");
		System.out.println(total);

	}

}
