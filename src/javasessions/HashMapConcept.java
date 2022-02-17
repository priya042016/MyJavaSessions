package javasessions;
import java.util.HashMap;

public class HashMapConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//key-value pair
		//<k,v>
		//not order based collection
		HashMap<String, String> prodMap=new HashMap<String, String>();
		prodMap.put("name", "Macpro");
		prodMap.put("seller", "xyzent");
		prodMap.put("size", "6 inch");
		
		System.out.println(prodMap.get("name"));
		
		//2nd HashMap
		
		HashMap<Integer, String> stuMap=new HashMap<Integer, String>();
		stuMap.put(1, "Anil");
		stuMap.put(2, "Pooja");
		stuMap.put(3, "Ravi");
		stuMap.put(4, "Anil");
		
		System.out.println(stuMap.get(1));
		System.out.println(stuMap.size());
		
		//to get the iterated values of prodMap pair
		
		stuMap.forEach((k,v)->System.out.println(k+":"+v));
		
		
	}

}
