package javasessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListConcept {

	public static void main(String[] args) {
		ArrayList ar1=new ArrayList();
		System.out.println(ar1.size());//default size is 0
		
		ar1.add(100);//0th index
		ar1.add("Tom");
		ar1.add("M");
		ar1.add(12.33);
		ar1.add(null);
		ar1.add("K");
		
		System.out.println(ar1.size());//6
		
		System.out.println(ar1.get(0));//100
		System.out.println(ar1.get(1));//Tom
		System.out.println(ar1.get(2));//M
		System.out.println(ar1.get(3));//12.33
		//System.out.println(ar1.get(4));//null//K
		//System.out.println(ar1.get(5));//K//java.lang.IndexOutOfBoundsException
		
		ar1.add(4, "KA");//inserting KA element at 4th index ar1.add(index, element)
		
		System.out.println(ar1.get(4));//null//KA
		System.out.println(ar1.get(5));
		System.out.println(ar1.get(6));
		System.out.println(ar1);
System.out.println("_____________________________________________________________________________________");		
//Integer ArrayList
		
		ArrayList<Integer> ar2=new ArrayList<Integer>();
		System.out.println(ar2.size());//default size is 0
		ar2.add(2);
		ar2.add(null);
		ar2.add(0);
		//ar2.add(1.1);//error
		
		System.out.println(ar2.get(1));
		System.out.println(ar2.get(2));
		System.out.println(ar2);
System.out.println("_____________________________________________________________________________________");

//Double ArrayList
		ArrayList<Double> ar3=new ArrayList<Double>();
		System.out.println(ar3.size());//default size is 0

//String ArrayList
		ArrayList<String> ar4=new ArrayList<String>();
		System.out.println(ar4.size());//default size is 0
		System.out.println(ar4);
System.out.println("_____________________________________________________________________________________");
//Object ArrayList
		ArrayList<Object> ar5=new ArrayList<Object>();
		ar5.add("Mala");
		ar5.add(25);
		ar5.add('F');
		ar5.add(12587.54);
		
		//using for loop
		for (int i=0; i<ar5.size(); i++)
		{
			System.out.println(ar5.get(i));
		}
		
		//using for each loop
		for (Object j:ar5) {
			System.out.println(j);
		}
		System.out.println(ar5);
		
		//using ArrayList Methods
		ArrayList<String> empList=new ArrayList<String>();
		empList.add("Krithik");
		empList.add("Akashini");
		empList.add("Priya");
		empList.add("Manasa");
		//sorting in ascending order
		Collections.sort(empList);
		for(String k:empList) {
			System.out.println(k);
		}
System.out.println("___________________________");
		//in reverse order
		Collections.reverse(empList);
		for(String k:empList) {
			System.out.println(k);
		}
System.out.println("___________________________");		
		//reverse using for loop
//		for (int m=empList.size()-1;m>=0;m--) {
//			System.out.println(empList.get(m));
//			
//		}
	ArrayList<String> empList2=new ArrayList<String>();
	empList2.add("Ravi");
	
	empList.addAll(empList2);
	System.out.println(empList);
	
//String to charArrayList
	String str = "abcd";
	ArrayList<Character> chars = new ArrayList<Character>();
	
	//System.out.println(str.toCharArray());//abcd
	
	for (char c : str.toCharArray()) {
	  chars.add(c);
	  System.out.println(c);
	}
	System.out.println(chars);
System.out.println("_________________________________________________________________");
//how to give input for arraylist in a singleline:
System.out.println("_________________________________________________________________");
	List<Integer> num=Arrays.asList(1,2,3);
	System.out.println(num);
System.out.println("__________________________________________________________________________");

List<String> msg=Arrays.asList("Tom", "Peter");
System.out.println(msg);




			
		}
}

	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

