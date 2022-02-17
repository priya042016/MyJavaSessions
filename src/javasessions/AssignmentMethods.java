package javasessions;

public class AssignmentMethods {

	
	 //1.Write a program to print the sum of two numbers entered by user by defining your own method
	 	
	public static int sum(int a, int b) {//static method (need not create object to call)
		return a+b;
	}
	//2. Define a method that returns the product of two numbers entered by user
	public static int product (int a, int b) {//static method (need not create object to call)
		return a*b;
	}
	
	//3.Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
	
	public static void circle(double raidius) {
		
		double pi=3.14;
		double area=pi*raidius*raidius;//pi*r*r
		double circumference=2*3.14*raidius;//2*pi*r
		
		System.out.println("Area of circle with radius "+raidius+ " is:"+area);
		System.out.println("Circumference of circle with radius "+raidius+ " is:"+circumference);
		
		
	}
	
	
	
	
	
	//4. Define two methods to print the maximum and the minimum number respectively among three numbers entered by user.
	
	public static int max(int a, int b) {//static method (need not create object to call)
		if (a>b) {
			System.out.println(a+" is maximum");
			return a;
		}
		else {
			System.out.println(b+" is maximum");
			return b;
		}
		
	}
	//minimum of two numbers:
	
	public static int min(int a, int b) {//static method (need not create object to call)
		if (a<b) {
			System.out.println(a+" is minimum");
			return a;
		}
		else {
			System.out.println(b+" is minimum");
			return b;
		}
		
	}
	
	//5. Define a program to find out whether a given number is even or odd.
	
	public static void mod(int a) {
		if(a%2==0) {
			System.out.println(a+" is even number");
		}
		else {
			System.out.println(a+" is odd number");
		}
	}
	
	
	
	/*
	 * A person is eligible to vote if his/her age is greater than 
Marks        Grade
91-100         AA
81-90          AB
71-80          BB
61-70          BC  
51-60          CD
41-50          DD	
<=40          Fail or equal to 18. Define a method to find out if he/she is elligible to vote.
	
	 */
		
		public static String studentGrade(int marks){
			
			String grade;
			
			if((marks>90) && (marks<=100)) {
				System.out.println("marks is:"+marks);
				grade= "Grade AA";
				
			} else if(marks>80 && marks<=90) {
				System.out.println("marks is:"+marks);
				grade= "Grade AB";
			}else if(marks>70 && marks<=80) {
				System.out.println("marks is:"+marks);
				grade= "Grade BB";
			}else if(marks>60 && marks<=70) {
				System.out.println("marks is:"+marks);
				grade= "Grade BC";
			}else if(marks>50 && marks<=60) {
				System.out.println("marks is:"+marks);
				grade= "Grade CD";
			}else if(marks>40 && marks<=50) {
				System.out.println("marks is:"+marks);
				grade= "Grade DD";
			}else {
				System.out.println("marks is:"+marks);
				grade= "Fail";
			}
			
		return grade;	
		}
		
		public static boolean isEligibleToVote(int age, int marks) {
			
			boolean flag=false;
			
			if ((age>=18) && (marks>=40)) {
				System.out.println("age is:"+age);
				System.out.println("Eligible to vote");
			}else {
				System.out.println("age is:"+age);
				System.out.println("not eligible to vote");
			}
			return flag;
			
		}
		
/*
 * 9. Write a program to print the factorial of a number by defining a method named 'Factorial'.
Factorial of any number n is represented by n! and is equal to 1*2*3*....*(n-1)*n. E.g.-
4! = 1*2*3*4 = 24
3! = 3*2*1 = 6
2! = 2*1 = 2
Also,
1! = 1
0! = 0

 */
 public static int factorial (int num) {
	 
	 int fact=1;
	 for (int i=1; i<=num; i++) {
		 fact=fact*i;  //1*2*3*4*5
		 }
	 System.out.println("factorial of: "+ num+" is: "+ fact);
	 return fact;
		 
 }
 //function to return order id from the given message
 public static int orderID(String msg) {
	 
	 String orderid=msg.substring(msg.indexOf("is")+3);//12345
	 int orid=Integer.parseInt(orderid);//converting to integer
	 return orid;
		 
 }
		


	
	public static void main(String[] args) {

		int total= sum(10,20);//sum of two numbers
		System.out.println(total);
		
		int multi=product(5,8);//multiplication of two numbers
		System.out.println(multi);
		
		int max=max(58,45);
		System.out.println(max);
		
		int min=min(85,43);
		System.out.println(min);
		
		mod(5); //odd number
		mod(8);//even number
 
		String grade=studentGrade(100);
		System.out.println(grade);
		
		boolean flag=isEligibleToVote(18, 12);
		System.out.println(flag);
		
		factorial(5);
		
		circle(4.2);
		int ordernum=orderID("Your order id is 12345");
		System.out.println(ordernum);
		
	}

}


