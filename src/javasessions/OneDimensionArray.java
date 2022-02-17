package javasessions;


public class OneDimensionArray {

	public static void main(String[] args) {
		
		
		int[] numbers= {3,44,12,53,6,87};
		//Scanner s=new Scanner(System.in);
		
		System.out.println("The elements in the array are:");
		
		for(int i=0; i<numbers.length; i++) {
			System.out.print(numbers[i]+" ");
		}
		System.out.println();
		
		System.out.println("the sum of the elements in the array are:");
		
		int sum=0;
		for(int i=0; i<numbers.length; i++) {
			sum=sum+numbers[i];
					}
		System.out.println(sum);
		
	}

}
