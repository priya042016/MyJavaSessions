package BuilderPattern;

public class UberTest {

	public static void main(String[] args) {
		//Use case 1
		Uber u=new Uber();
		u.login("Priya", "test@123").fromPlace("ACR").toPlace("Temple").vehicleType("Auto").chkPrice(200).selectPaymentMethod("Olamoney").booking()
		.generateOTP().sendMsg().logout().getOTP();
		System.out.println("_______________________________");
		
		//User case 2
		u.login().fromPlace("ACR").toPlace("abc").vehicleType("Auto").chkPrice(300).canceltrip().logout();
		
		//for user 2:
		System.out.println("______________________________________________________");
		Uber u2=new Uber();
		u2.login("Krithik", "admin@123").fromPlace("place1").toPlace("place 2").stopPlace("place 3").vehicleType("car").chkPrice(500)
		.booking().sendMsg().generateOTP().logout().getOTP();

	}

}
