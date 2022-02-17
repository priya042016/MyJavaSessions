package stringmanipulation;

public class NthOccuranceofChar {
	
	public static int findNthOccur(String str, char ch, int N) {
		int occur=0;
		
		// Loop to find the Nth
	    // occurrence of the character
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i)==ch) {
				occur=occur+1;
			}
			if(occur==N) {
				return i;
			}
		}
	return -1;
	}

	public static void main(String[] args) {
		String str="lava is java";
		char ch='a';
		int N=3;
		
		System.out.println(findNthOccur(str, ch, N));//3rd occurance of a is 9
		

	}

}
