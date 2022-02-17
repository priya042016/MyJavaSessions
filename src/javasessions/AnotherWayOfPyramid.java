package javasessions;

import java.util.Scanner;

public class AnotherWayOfPyramid {
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		System.out.println("Please enter no. of rows:");
		int rows=in.nextInt();//Scans the next token of the input as an int. 
		
		
		for(int i=1; i<=rows; i++) {
			//printing spaces
			for (int space=1; space<=rows-i; space++) {
				System.out.print("  ");
				}
				//printing star
				for (int star=1; star<=(2*i-1); star++) {//2n-1 formula will give odd number like 1,3, 5 etc
					
					System.out.print("* ");
					
				}
				
				System.out.println();
		}

	}
}



