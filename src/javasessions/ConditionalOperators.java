package javasessions;

import java.util.Scanner;

public class ConditionalOperators {

	public static void main(String[] args) {
		// print the highest of 3 numbers
		int a = 100;
		int b = 200;
		int c = 300;
		
	
		if ((a > b) && (a > c)) {
			System.out.println("The highest number is: " + a);
		} else if (b > c) {
			System.out.println("The highest number is: " + b);
		} else {
			System.out.println("The highest number is: " + c);
		}
		System.out.println("_____________________________________");
		String s1 = " hello";
		String s2 = "Hello";

		// if (s1.equals(s2)) {
		//if (s1.equalsIgnoreCase(s2)) {
		if (s1.replace(" ", "").equalsIgnoreCase(s2)){
			System.out.println("Both are equal");
		} else {
			System.out.println("Not equal");
		}
		System.out.println("_____________________________________");
		//take input from user
		Scanner input=new Scanner(System.in);//scanner class is used to take input from user
		
		System.out.println("enter first number ");
		int n1=input.nextInt();
		
		System.out.println("enter second number ");
		int n2=input.nextInt();
		
		System.out.println("enter third number");
		int n3=input.nextInt();
		
		if ((n1>n2) && (n1>n3)) {
			System.out.println("n1 is greatest"+n1);
		}
		else if(n2>n3) {
			System.out.println("n2 is greatest"+n2);
		}
		else {
			System.out.println("n3 is greatest"+n3);
		}
		
//		if (n1<0) {
//			System.out.println(n +" is Negative number");
//		}
//		else {
//			System.out.println(n+ " is postive number");
//		}
	

		
		
		
		
	}

}
