package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {
		FortisHospital fh=new FortisHospital();
		fh.emergencyServices();
		fh.medicalTraining();
		fh.cardioServices();
		fh.dentalServices();
		fh.entServices();
		fh.oncologyServices();
		fh.pediaServices();
		fh.physiosServices();
		fh.radiologyServices();
		fh.medicalFunds();//overridden method of grand parent Medical
		fh.medicalFunds(100);// overridden method of grand parent Medical with parent
		
		
		fh.covidTest();
		fh.healthGuidelines();//from class UNHG
		
		//top casting with USMedical Interface
		
		USMedical us=new FortisHospital();
		us.physiosServices();
		us.oncologyServices();
		us.cardioServices();
		us.emergencyServices();
		//us.medicalTraining//cannot access child's individual method and other interface methods
		us.medicalFunds();//grand parent method
		us.covidTest();
		us.optServices();//here overriden default method of child will be called. its not from USMedical if any overriden. If its not overriden then parent method will be called
		us.ambulance();//here parent USMedical's default method will be called
		System.out.println("minium us medical fee is:"+us.fee);
		System.out.println("_________________");
		
		//top casting with USMedical Interface
		
		UKMedical uk=new FortisHospital();
		uk.radiologyServices();
		uk.entServices();
		uk.emergencyServices();
		uk.medicalFunds();
		uk.covidTest();
		
		//top casting with USMedical Interface
		
		IndianMedical in=new FortisHospital();
		in.dentalServices();
		in.pediaServices();
		in.emergencyServices();
		in.medicalFunds();
		in.covidTest();
		in.covidReport("Omicron");
	
		
		
		//down casting
		
		//FortisHospital fh=new USMedical();//compile time error since we cant create object of an interface.
		

	}

}
