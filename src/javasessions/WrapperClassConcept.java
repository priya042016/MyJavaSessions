package javasessions;

public class WrapperClassConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		String x="100";
		System.out.println(x+30);//10030
		
		String m="200A";
		String n=m.substring(0, 3);//200
		
		System.out.println(Integer.parseInt(n)+20);//220
		
		//String to int
		int y=Integer.parseInt(x);
		System.out.println(y+30);//130
		
		//String to double
		String total="100.33";
		double d=Double.parseDouble(total);
		System.out.println(d+1.33);
		
		//String to boolean
		
		String flag="true";
		boolean flg=Boolean.parseBoolean(flag);
		if (flg) {
			System.out.println("True");
		}
		
		//int to String
		
		int j=500;
		String value=String.valueOf(j);
		System.out.println(value+30);
		
		//substring
		
		String msg="your order id is 12345";
		
		String msg1=msg.substring(msg.indexOf("is"));
		System.out.println(msg1);//is 12345
		
		System.out.println(msg.substring(msg.indexOf("is")+3));//12345
		
		//another method
		System.out.println(msg.substring(17, 22));
		
		
		
		
		
		
		
		

	}

}
