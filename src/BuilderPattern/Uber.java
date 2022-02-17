package BuilderPattern;

public class Uber {
	
	int OTP;
	
	public Uber login(String uname, String pwd) {
		System.out.println("login successful"+uname+" "+pwd);
		return this;
	}
	
	public Uber login() {
		System.out.println("logic successful");
		return this;
	}
	public Uber fromPlace(String frmplace) {
		System.out.println("selecting from place: "+frmplace);
		return this;
	}
	public Uber toPlace(String toplace) {
		System.out.println("selecting to place: "+toplace);
		return this;
	}
	public Uber chkPrice(int price) {
		System.out.println("price is: " +price);
		return this;
	}
	public Uber stopPlace(String stopplace) {
		System.out.println("selecting stop place: "+stopplace);
		return this;
	}
	public Uber vehicleType(String vtype) {
		System.out.println("selecting vehicle type: "+vtype);
		return this;
	}
	public Uber booking() {
		System.out.println("booking....");
		return this;
	}
	public Uber selectPaymentMethod(String method) {
		System.out.println("selecting payment:"+method );
		return this;
	}
	public Uber sendMsg() {
		System.out.println("sending message");
		return this;
	}
	public Uber generateOTP() {
		System.out.println("Generating OTP: "+12345);
		this.OTP=12345;
		return this;
	}
	public int getOTP() {
		System.out.println("OTP is: "+12345);
		return this.OTP;
	}
		
	public Uber canceltrip() {
		System.out.println("cancelling trip");
		return this;
	}
	public Uber logout() {
	System.out.println("logout successful");	
	return this;
	}
}	
