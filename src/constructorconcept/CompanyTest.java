package constructorconcept;

import java.util.ArrayList;

public class CompanyTest {

	public static void main(String[] args) {
		
		Company c=new Company("Flipkart");//calling constructor
		
		System.out.println(c.name);//Flipkart
		//System.out.println(c.empCount);//default value 0
		//System.out.println(c.catlist);//default value null
		
		System.out.println(c.companyinfo("snapdeal"));//calling function
		
		
		//adding arraylist
		ArrayList<String> amlist=new ArrayList<String>();
		amlist.add("Electronics");
		amlist.add("Shoes");
		amlist.add("Cloths");
		
		Company c1=new Company("Amazon", 200000, amlist, true);
		System.out.println(c1.name);
		System.out.println(c1.empCount);
		System.out.println(c1.catlist);
		System.out.println(c1.isFunded);

	}

}
