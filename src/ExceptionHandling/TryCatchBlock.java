package ExceptionHandling;

public class TryCatchBlock {
	
	String name;

	public static void main(String[] args) {
		TryCatchBlock t=new TryCatchBlock();
		t=null;//NullPointerException
		try {
		t.name="priya";
		}catch(NullPointerException e) {
			System.out.println("NPE");
			e.printStackTrace();
		}
				
		System.out.println("A");
		
		try {
		int i=9/0;
		int k[]=new int[2];//java.lang.ArithmeticException: / by zero
		System.out.println(k[4]);//java.lang.ArrayIndexOutOfBoundsException:
		System.out.println("hello");
		}
		
//		catch(Exception e) {
//			System.out.println("some exception");
//			e.printStackTrace();
//		}
		
		
		catch(ArithmeticException e) {
			System.out.println("Arith");
			e.printStackTrace();
			
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("AIOB is coming");
			//e.printStackTrace();
	}
		System.out.println("Bye");
		

	}

}
