package javasessions;

public class AssignmentLoops {

	public static void main(String[] args) {
		/*
		 * 1. WAP to print following output using for and while loops:
 
I am Batman

I am Batman

I am Batman

I am Batman

I am Batman

		 */
		byte i=1;
		for (i=1; i<=5; i++) {
			System.out.println("I am Batman");
		}
		
		byte j=1;
		while(j<=5) {
			System.out.println("I am Batman");
			j++;
				}
System.out.println("_____________________________________________________________________");	
/*
 * 2. WAP to print following output:
I am Batman 1

I am Batman 2

I am Batman 3

I am Batman 4

I am Batman 5

I am Batman 6

I am Batman 7

I am Batman 8

I am Batman 9

 */
		byte k=1;
		while(k<10)
		{
			System.out.println("I am Batman "+k);
			k++;
					}
System.out.println("_________________________________________________________________");

/*
 * 3. WAP to print 10 to 1 using for, while and do-while loop
 */
		
		byte m=10;
		while(m>=1) {
			System.out.println(m);
			m--;
		}
		
//using do while
		
		byte n=10;
		do {
			System.out.println(n);
			n--;
		}while (n>=1);
		
System.out.println("__________________________________________________");
/*
 *4. Write a program in Java to print "Hello World" ten times using while loop
 */
byte p=1;
while(p<=10) {
		System.out.println("Hello World");
		p++;
}
System.out.println("_______________________________________________________________");
/*
 * 5. Write a program in Java to print 1 to 10 using while loop but quit if multiple of 7 is encountered
 */
byte s=1;
while (s>=1) {
		if (s%7!=0)
		{
		System.out.println(s);
		}
		else 
		{
		System.out.println("Multiple of 7 is found");
		break;
		}
		s++;
}
System.out.println("_______________________________________________________________________");
/*
 *6. WAP to find out the max number from the given positive numbers- Done
 */
byte x=20;
byte y=30;

if (x>y) {
	System.out.println(x);
}
else {
	System.out.println(y);
}



	}	
}
