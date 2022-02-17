package javasessions;

public class SortingOfStrings {
	
	static String arr[]= {"Now","the","is","time","for","all","men"};

	public static void main(String[] args) {
	
	
	for(int i=0; i<arr.length; i++) {
		for (int j=i+1; j<arr.length; j++) {
			if(arr[i].compareTo(arr[j])<0){
				{
					String t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;
				}
				System.out.println(arr[j]);
			}
		}
	}
	}

}
