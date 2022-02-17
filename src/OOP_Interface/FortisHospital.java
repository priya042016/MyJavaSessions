package OOP_Interface;

public class FortisHospital extends UNHG implements USMedical, UKMedical, IndianMedical {
	
	//individual method
	public void medicalTraining() {
		System.out.println("FH------medical training--individual method");
	}
	
	//Common method
	public void emergencyServices() {
		System.out.println("FH------emergencyServices");
	}
	
	//USMedical
	@Override
	public void physiosServices()
	{
		System.out.println("FH------physiosServices");
	}
	@Override
	public void cardioServices()
	{
		System.out.println("FH------cardioServices");
	}
	@Override
	public void oncologyServices(){
		System.out.println("FH------oncologyServices");
	}
	
	//UKMedical
	@Override
	public void radiologyServices() {
		System.out.println("FH------radiologyServices");
		
	}
	@Override
	public void entServices() {
		System.out.println("FH------entServices");
	}
	
	//IndianMedical
	@Override
	public void dentalServices() {
		System.out.println("FH------dentalServices");
		
	}
	@Override
	public void pediaServices() {
		System.out.println("FH------pediaServices");
		
	}

	//Medical( Grand Parent) method
	@Override
	public void medicalFunds() {
	System.out.println("FH_-------------------medicalFunds");
		
	}
//Grand parents parent WHO method
	@Override
	public void covidTest() {
		System.out.println("FH_____________________covidtest");
		
	}

	@Override
	public void covidReport(String version) {
		System.out.println("Repot version:"+version);
		
	}

	@Override
	public void medicalFunds(int fee) {
		System.out.println("FH_____________fee:"+fee);
		
	}
	//Method hiding.
	public static void billing() {
		System.out.println("FH--------billing");
	}
	//overriding default method from USMedical
	@Override
	public void optServices() {
		System.out.println("FH-----------opt");
	}
	

	
	
	
		
}
