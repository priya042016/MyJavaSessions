package javasessions;

public class LoopsConcept {

	public static void main(String[] args) {
		byte i=1;
		for(;i<=5;i++) {
			System.out.println("Test"+i);
		}
//infinite loop
//		for(;;) {
//			System.out.println("hello");
//		}
//	
	
		//using double
	 for (double d=1.1; d<=10.5;) {
		 System.out.println(d);
		 d++;
	 }
System.out.println("____________________________________________");	

for (double d=1.1; d<=3.5;) {
	 System.out.println(d);
	 d=d+0.1;
}
System.out.println("_____________________________________________");
//print from a to z

for (char c='a'; c<='z'; c++)
{
	System.out.println(c);	
}

System.out.println("_________________________________");

//To print the ASCII values of a to z:(it will be from 97 to 122)
for (char c='a'; c<='z'; c++)
{
	System.out.println("ASCII value of "+c+" is: "+(int)c);	
}
System.out.println("_______________________________________________________");

//To print the ASCII values of A to Z: it will be from 65 to 90
for (char c='A'; c<='Z'; c++)
{
	System.out.println("ASCII value of "+c+" is: "+(int)c);	
}
System.out.println("_______________________________________________________");

//To print the ASCII values of 0 to 9: it will be from 48 to 57
for (char c='0'; c<='9'; c++)
{
	System.out.println("ASCII value of "+c+" is: "+(int)c);	
}
System.out.println("___________________________________________________________");

//Print odd and even numbers from 1 to 50 using for loop:

for (byte d=1; d<=10; d++) {
	if(d%2==0) {
		System.out.println(d +" is even number");
	}
		else {
			System.out.println((d+" is odd number"));
	}
}   




























	}
}
	
	
	
	
	
	
	
	
	
	