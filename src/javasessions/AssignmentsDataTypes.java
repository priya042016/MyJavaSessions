package javasessions;

public class AssignmentsDataTypes {

	public static void main(String[] args) {
		/*
		 * 1. Write a Java program to print 'Hello' on screen and then print your name on a separate line. Expected Output :
Hello 
Naveen K
		 */
		
//		System.out.println("Hello");
//		System.out.print("Naveen");
		
System.out.println("__________________________________________________________________");
		/*
		 * 2. Write a Java program to print the sum of two numbers. 
		 * Test Data: 
			 74 + 36 
			Expected Output :
			110
		 */
		
//		byte a=74;
//		byte b=36;
//		System.out.println(a+b);
System.out.println("__________________________________________________________________");

		/*
		 * 3. Write a Java program to divide two numbers and print on the screen. 
		Test Data : 
		50/3
		Expected Output :
		16	
		 */
		byte c=50;
		byte d=3;
		System.out.println(c/d);
System.out.println("__________________________________________________________________");

/*
 *4. Write a Java program to print the result of the following operations. Change your test data accordingly.
Test Data:
a. -5 + 8 * 6
b. (55+9) % 9 
c. 20 + -3*5 / 8 
d. 5 + 15 / 3 * 2 - 8 % 3 
Expected Output :
43 
1 
19 
13
 
 */
System.out.println(-5 + (8 * 6));	
System.out.println((55+9) % 9);
System.out.println(20 + (-3*5) / 8);
System.out.println(5 +( 15 / 3 )* 2 - (8 % 3));
System.out.println("___________________________________________________________________");

/*
 * 5. Write a Java program to compute the specified expressions and print the output. Go to the editor
Test Data:
•	((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) 
Expected Output
2.138888888888889

 */
System.out.println((((25.5 * 3.5 )- (3.5 * 3.5)) / (40.5 - 4.5)));
System.out.println("______________________________________________________________________________________");

/*
 * 6. Try to concat "Hello Selenium" with a character 't'.
  */
System.out.println("Hello Selenium"+'t');
System.out.println("__________________________________________________________________________");

/*
 * 7. Create three int variables having values like : 100, 200, 3400. Add them and concatenate and generate this output String : 
"Your Total amount is. 3700".

 */
int e=100;
int f=200;
int g=3400;
System.out.println("Your Total amount is."+ (e+f+g));
System.out.println("_____________________________________________________________________________________________");

/*
 * 8. What should be the output for :

byte b3 = 065; 
System.out.println(b3);

 */
byte b3 = 065;
System.out.println(b3);
	}

}
