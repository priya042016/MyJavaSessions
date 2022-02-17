package javasessions;

public class MethodChaining {
	
	String name;
	static int wheels=4;
		
	public void m1() {
		System.out.println("m1");
		m2();
		MethodChaining.t1();//use class name to call static
				}
	public void m2() {
		System.out.println("m2");
		m3();
	}
	public void m3() {
		System.out.println("m3");
		System.out.println(MethodChaining.wheels);
	}
	
	public static void t1() {
		System.out.println("t1");
		MethodChaining mc1=new MethodChaining();
		mc1.m3();//use object to call non-static method
		t2();
		
	}
	public static void t2() {
		System.out.println("t2");
		System.out.println(MethodChaining.wheels);
		t3();
	}
	
	public static void t3() {
		System.out.println("t3");
		}

	public static void main(String[] args) {
		MethodChaining mc=new MethodChaining();
		mc.m1();
		System.out.println(mc.wheels);
		
		

	}

}
