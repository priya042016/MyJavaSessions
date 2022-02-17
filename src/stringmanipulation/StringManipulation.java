package stringmanipulation;

import java.util.ArrayList;

public class StringManipulation {

	public static void main(String[] args) {

		String str="Hello This is my Java Code i am happy";
		System.out.println(str.length());
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(25));
		System.out.println(str.charAt(str.length()-1));//to find the last character of the array
		//System.out.println(str.charAt(26));//java.lang.StringIndexOutOfBoundsException
		System.out.println(str.indexOf('i'));//8//first occurance of i
		System.out.println(str.indexOf('i', str.indexOf('i')+1));//11//second occurance of i
		System.out.println(str.indexOf('i', str.indexOf('i')+1)+1);
		System.out.println(str.indexOf("Java"));//starting position of Java
		
		System.out.println(str.indexOf("world"));//-1
		//String Literals
		String s1="hello world";
		String s2="Hello world";
		System.out.println(s1==s2);
		
		//String object creation
		String s4=new String("Hello Priya");
		//System.out.println(s4);
		
		//Strings are immutable, here it will not replace "Hello Python". instead it will create another literal "Hello Java"
		String s3="Hello Python";
		s3="Hello Java";
		System.out.println(s3);
		
		s4=null;
		//System.out.println(s4.equals(s1));//NullPointerException
		System.out.println(s1.equals(s4));//false
		
		System.out.println(s1.contains("hello"));//true
		
		String s5="   hello              world";
		System.out.println(s5.trim());//"hello      world";
		System.out.println(s5.replace(" ", ""));//helloworld
		
		String dob="01-01-1990";
		System.out.println(dob.replace("-","/"));
		
		String lang="Java-Python-Ruby";
	String lg[]= lang.split("-");
	System.out.println(lg[0]);//Java
	System.out.println(lg[2]);//Ruby
	//System.out.println(lg[3]);//AIOB
	
	//important
	
	String pop="xXtestingxxXSeleniumXxXQtpXXxXCypress";
	String p[]=pop.split("xX");
	System.out.println(p[0]);// empty[
	System.out.println(p[1]); //testingx
	System.out.println(p[2]); //SeleniumX
	
	String empData="Devi:Kumar:Bangalore:IBM";
	
	String e[]=empData.split(":");
	for(String i:e) {
		System.out.println(i);
	}
	
	//reverse string
	String s8="Selenium";
	char ch;
	String revStr="";
	
	System.out.println(s8.length());
	
	for (int i=s8.length()-1; i>=0; i--) {
		ch=s8.charAt(i);
		revStr=revStr+ch;
	}
	System.out.println(revStr);
	
	
		
		
		

	}

}
