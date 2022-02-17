package javasessions;

public class StartPattern {

	public static void main(String[] args) {
		
		// pattern 1
		for (int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("________________________________");
		
		for (int i=1; i<=5; i++) {
			for(int j=5; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("_________________________________");
		//pattern 3
		for (int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i=1; i<=5; i++) {
			for(int j=5; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		//pattern 4
		
		System.out.println("_________________________________");
		
		for (int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				for (int k=1; k<=j;k++) {
					System.out.print(" "+"*");
				}
				//System.out.print("*");
				System.out.println();
			}
			System.out.println();
		}
		
		

	}

}
