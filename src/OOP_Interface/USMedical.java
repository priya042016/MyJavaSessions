package OOP_Interface;

public interface USMedical extends Medical{
	
	int fee=10;//by default interface variables are static and final in nature. we cant change the value of it once assigned.
	
	public void physiosServices();
	public void cardioServices();
	public void oncologyServices();
	public void emergencyServices();
	
	//after jdk 1.8:
	//1. we can have static method with method body:
	//This method cannot be ovverridden in child class as it is static. But we can have same static method in the child class. this is known as method hiding.
	
	public static void billing() {
		System.out.println("USMedical--------billing");
		
	}
	
	//2. we can have non-static default method:
	
	default void optServices() {
		System.out.println("USMedical-----------opt");
	}
	
	default void ambulance() {
		System.out.println("USMEdical----------ambulance");
	}
	
	

}
