package javasessions;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		int[][] m1= {{1,2,3},{4,5,6}};
		int[][] m2= {{7,5,6},{5,3,2}};
		
		int[][] sum=new int[1][1];
		
		
		//printing matrix
		
//		System.out.println("The given matrix is: ");
//		System.out.println(m1.length);
//		
//		
//		for (int i=0; i<=m1.length; i++) {
//			for(int j=0; j<=m2.length; j++) {
//				System.out.print(m1[i][j]+" ");
//					}
//			System.out.println();
//			
//		}
//		
		//matrix addition
		
		System.out.println("the sum of given two matrices is: ");
		
		for (int i=0; i<=m1.length; i++) {
			for(int j=0; j<=m2.length; j++) {
				sum[i][j]=m1[i][j]+m2[i][j];
				System.out.print(sum[i][j]+" ");
					}
			System.out.println();
			
		}
		
		
				
	}

}
