package ExceptionHandling;

public class finallyIntQn {
	
	public static int getMarks(String name) {
		int marks=0;
		System.out.println("Getting marks of:"+name);
		if(name.equals("Ram"))
		{
			try {			
			marks=90/0;
			} catch(ArithmeticException e) {
				System.out.println("Arithmetic");
				return marks;
				//return -2;
			}
			
			finally {
				System.out.println("student failed");
				return -3;
			}
		}
		else {
			System.out.println("student not found");
			return -1;
		}
		//return marks;
	}

	public static void main(String[] args) {
		int n=getMarks("Ram");
System.out.println(n);
	}

}
