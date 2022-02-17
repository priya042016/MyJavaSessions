package javasessions;

public class PyramidPattern {

	
		// Java code to demonstrate star pattern
			
			//Main function to print triangle
			public static void printTriangle(int n)
			{
				// k= number of spaces
				int k = 2*n - 2,i,j;

				// outer loop to handle number of rows
				
				for (i=0; i<n; i++)
				{

					// inner loop to handle number spaces
					// values changing acc. to requirement
					
						for (j=0; j<k; j++)
						{
							// printing spaces
							System.out.print("/");
						}

					// decrementing k after each loop
					k = k - 1;

					// inner loop to handle number of columns
					
						for (j=0; j<=i; j++ )
						{
							// printing stars
							System.out.print("* ");
						}

					// ending line after each row
					System.out.println();
				}
			}
			
			// Calling Function
			public static void main(String args[])
			{
				int n = 5; //number of rows
		                 //call function to print triangle
				printTriangle(n);
			}
}
	

