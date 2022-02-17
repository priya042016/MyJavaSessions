package javasessions;

public class DataTypes {

	public static void main(String[] args) {
		/*
		 * @author Priya
		 * this is my first Java Program
		 */

		char c='a';//Gives 
		char d='b';
		System.out.println(c);
		System.out.println(d);
		System.out.println(c+d);//Ascii value of c+d= 97+98=195
		System.out.println("__________________");
		
		String x="Hello";
		String y="World";
		System.out.println(x+y);//HelloWorld
		//System.out.println(0/9);//0
		//System.out.println(9/0); //java.lang.ArithmeticException: / by zero
		//System.out.println(9.0/0); //infinity
		//System.out.println(9.0/0.0);//infinity
		//System.out.println(0/0); //java.lang.ArithmeticException: / by zero
//		System.out.println(0.0/0.0);//Nan (Not a Number)
//		System.out.println(0/12.33);//0.0
//		System.out.println(0.0/9);//0.0
//		System.out.println(9%2);//Mod gives remainder 1
//		System.out.println(0.1+0.2); //0.30000000000000004 (0.100000000002+0.2000000000000000002) adding binary values (interview question)
//		System.out.println(0.3+0.4);//0.7
		
		//post increment
		int a=1;
		int b=a++; //b will be one and a will be a=a+1, execution will be from left to right
		System.out.println(a); //2
		System.out.println(b); //1
		
		//pre increment
		int e=1;
		int f=++e; //e=e+1, and the same will be given to f
		System.out.println(e); //2
		System.out.println(f); //2
		
		//post decrement
		int g=2;
		int h=g--; //g will be given to h first and g will become g=g-1 
		System.out.println(g); //1
		System.out.println(h); //2
		
		//pre decrement
		int l=3;
		int m=--l; //l=l-1, and the same will be given to m
		System.out.println(m); //2
		System.out.println(l); //2
		
		byte p=054;
		System.out.println(p); //44 (number starting with 0 is octal number and should be between 0 to 7 ) (5*8)+4=44
		
		int q=0756;
		System.out.println(q); //494 (number starting with 0 is octal number and should be between 0 to 7 ) (7*64)+(5*8)+6
		
			
	}

}
