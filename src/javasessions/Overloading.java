package javasessions;

//method overloading or polymorphism
public class Overloading {
	
	public void test() {
		System.out.println("test");
	}
	public int test(int i, int j) {
		return i-j;
	}
	public double test(int j, double i) {
		return j+i;
	}
	
	public void test(int i, String j) {
		
		System.out.println("test 2");
	}
	
	public void test(String i, int j) {
		System.out.println("test 3");
	}
	

	public static void main(String[] args) {
	Overloading ov=new Overloading();
	double res=ov.test(5, 10.2);
	System.out.println(res);
	int r=ov.test(20,10);
	System.out.println(r);
	ov.test("priya", 30);
	ov.test(20, "karu");

	}

}
