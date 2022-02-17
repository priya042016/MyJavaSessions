package javasessions;

import java.util.Arrays;

public class StaticArray {

	public static void main(String[] args) {
		//print values of array
		
		int a[]= new int[3];
		System.out.println(Arrays.toString(a));//default value is 0
		a[0]=10;
		a[1]=20;
		a[2]=30;
		//a[3]=40;//java.lang.ArrayIndexOutOfBoundsException:
		System.out.println("Length of the array a is:"+ a.length);
//		for (byte i=0;i<a.length;i++)
//		{
//		System.out.println(a[i]);		
//		}
		
		//using for each loop
		System.out.println(Arrays.toString(a));
		for(int i:a)
		{
			System.out.println(i);
			//System.out.println(a);//gives memory hashcode value or random number
		}
		System.out.println("Sum of array content is:"+(a[0]+a[1]+a[2]));
		//to print the array contents
System.out.println("____________________________________________________________________");
//printing double array
 		double d[]=new double[2];
 		System.out.println(Arrays.toString(d));//default value is 0.0
 		d[0]=40.12;
 		d[1]=10.25;
 		System.out.println(Arrays.toString(d));
 		for(double i:d) {
 			System.out.println(i);
 		 		}
System.out.println("____________________________________________________________________"); 
//character array
		char c[]=new char[2];
		System.out.println(Arrays.toString(c));//default value is space
		c[0]='c';
		c[1]='d';
		System.out.println(Arrays.toString(c));
		for(char i:c) {
			System.out.println(i);
		}
System.out.println("____________________________________________________________________"); 

//String array
		String str1[]=new String[2];
		System.out.println(Arrays.toString(str1)); //default value is null
		str1[0]="Akashini";
		str1[1]="Krithik";
		for(String i:str1)
		{
			System.out.println(i);
		}
		System.out.println(Arrays.toString(str1));
System.out.println("________________________________________________________________________");

//Object Array
	Object obj[]=new Object[5];
	System.out.println(Arrays.toString(obj));//default value is null
	System.out.println(obj.length);
	obj[0]="Priya";
	obj[1]="30";
	obj[2]="08/03/1989";
	obj[3]=900000.33;
	obj[4]='F';
			
	for (Object i:obj)
	{
		System.out.println(i);
	}
	System.out.println(Arrays.toString(obj));







	}

}
