package javasessions;

import java.util.ArrayList;
import java.util.Arrays;

public class Company {
	
	//WAF of Object array
	//function name: compnayInfo
	//input param: name(String)
	
	public Object[] getCompanyInfo(String name) {
		Object[] info=new Object[3];
		
		System.out.println("Getting compnay info of:" + name);
		
		if (name.equals("IBM")) {
			info[0]="IBM";
			info[1]="1987.54";
			info[2]="1980";
		}
		else if (name.equals("DELL")) {
			info[0]="DELL";
			info[1]="1987.54";
			info[2]="1951";
		}
		else {
			System.out.println(name+ " :Company info not found");
				}
		return info;
				}
	
	//WAF of ArrayList
	//name: getproductdetails
	//input param: compName(String)
	//return: product list
	public ArrayList<String> getProductDetails(String compName) {
		ArrayList<String> details=new ArrayList<String>();
		
		System.out.println("Getting product dteails of company:"+ compName);
		switch (compName.toLowerCase()) {
			case "amazon":
				details.add("Laptops");
				details.add("Mobiles");
				break;
			case "myntra":
				details.add("Sarees");
				details.add("Kurtas");
				break;

		default:
			System.out.println("compnay name not found");
			break;
		}
		return details;		
	}

	public static void main(String[] args) {
		Company comp=new Company();
		
		Object[] ibm=comp.getCompanyInfo("IBM");
		System.out.println(Arrays.toString(ibm));
		
		for(int i=0; i<ibm.length; i++){
			System.out.println(ibm[i]);
		}
		
		Object[] c2=comp.getCompanyInfo("DELL");
		System.out.println(Arrays.toString(c2));
		
		Object[] c3=comp.getCompanyInfo("Wipro");
		System.out.println(Arrays.toString(c3));
		
		
		
		ArrayList<String> amlist=comp.getProductDetails("Amazon");
		System.out.println(amlist);
		
		for( String i:amlist) {
			System.out.println(i);
		}
		System.out.println("Amazon product count:" +amlist.size());
		
		ArrayList<String> mynlist=comp.getProductDetails("Myntra");
		//System.out.println(mynlist);
		
		for(int j=0; j<mynlist.size();j++) {
			System.out.println(mynlist.get(j));
		}
		ArrayList<String> snapdealist=comp.getProductDetails("Snapdeal");
		System.out.println(snapdealist);
		
		

	}

}
