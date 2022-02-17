package javasessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*1. Write a Java program to create a new array list,
                 *  add some colors (string) and print out the collection*/

public class AssignmentArrayList {

	public static void main(String[] args) {
		ArrayList<String> colors=new ArrayList<String>();
		
		System.out.println(colors.size());
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		System.out.println(colors.size());
		for(String i:colors) {
			System.out.println(i);
		}
		System.out.println(colors);
System.out.println("______________________________________");
		//using for loop
		for (int j=0; j<colors.size();j++) {
			System.out.println(colors.get(j));
		}
System.out.println("________________________________________________________________________");
 /*
  *2 . Write a Java program to insert
 *  an element into the array list at the first and last positions.*/

   		ArrayList<String> ar=new ArrayList<String>();
   		//ar.(index, element) to add the element at the particular index
  		ar.add(0, "First");
  		ar.add(ar.size(), "Last");
  		System.out.println(ar.size());
  		
  		for(String i:ar) {
			System.out.println(i);
		}
System.out.println("___________________________________________________________________________");
/* 3. Write a Java program to retrieve an element 
 * (at a specified index) from a given array list.
 */
		ArrayList<String> ar1=new ArrayList<String>();

		System.out.println(ar1.size());//default size is 0
		ar1.add(0, "one");
		ar1.add(1, "two");
		ar1.add(2, "three");
		System.out.println(ar1.size());
		System.out.println(ar1.get(1));//get element at the first index
System.out.println("___________________________________________________________________________________");  		
/* 4. Write a Java program to update specific array element by given element.
 * 
 */
//use the arraylist of qn. 3

		ar1.add(2, "four");
		System.out.println(ar1.size());
		System.out.println(ar1);
System.out.println("_________________________________________________________________________");
/* 5. Write a Java program to remove the third  element from a array list. 
 * 
 */
		ar1.remove(2);
		System.out.println(ar1.size());
		System.out.println(ar1);
System.out.println("_________________________________________________________________________");
		
/* 6. Write a Java program to search an element in a array list.
 * 
 */
		ArrayList<String> city=new ArrayList<String>();

		System.out.println(city.size());
		city.add("Chennai");
		city.add("HYD");
		city.add("Bangalore");
		boolean flag=city.contains("Delhi");
		if (flag==false){
			System.out.println("Not Found");
		}
		else 
		{
				System.out.println("found");
			
		}
/* 7. Write a Java program to reverse elements in a array list
         *         
  */
		Collections.reverse(city);
		for (String i:city) {
			System.out.println(i);
		}
		System.out.println(city);
System.out.println("________________________________________________________");
/*
 * 7b. Reverse the array List:

*/
ArrayList<String> studentNames = new ArrayList<String>();
                studentNames.add("Varun");
                studentNames.add("Reena");
                studentNames.add("Naveen");
                //using for loop without using collection class
                for (int i=studentNames.size()-1; i>=0; i--)
                {
                	System.out.println(studentNames.get(i));
                            }
                //using collections class to reverse
                Collections.reverse(studentNames);
                System.out.println(studentNames);
System.out.println("______________________________________________________________");
 /* 8. Write a Java program to extract a portion of a array list.
                 *         
                 */
//list is the super class of ArrayList
                
                List<Integer> num=Arrays.asList(1,2,3,4,5);
               System.out.println(num.subList(1, 3));//3rd index will not be taken
               
 System.out.println("______________________________________________________________");
 
 //8b. Extract a portion:
	 String Player[] = {"Dhoni", "Rohit", "Virat", "Dhawan", "Malinga", "Rishab"};
	 int size=Player.length;//size of array
	 System.out.println(size);//size of array
	 //extracting the portion of array
	 for (int j=1; j<=Player.length-4; j++) {
		 System.out.println(Player[j]);
	 }
	 System.out.println("__________________________________");
	//converting stating array Player to Arraylist(dynamic array) 
	List<String> list=Arrays.asList(Player);
	//extracting using sublist function
	System.out.println(list.subList(1, 3));//here the 3rd index content will not be taken
	//extracting using for loop
	for(int j=1; j<=list.size()-3; j++)
	{
		System.out.println(list.get(j));//here it will take 1st , 2nd and 3rd index content
	}
	System.out.println(list);//Arraylist
	System.out.println(list.size());//size of arrayList
	
/*
 *         9 Write
 a Java program of swap two elements in an array list
 */
	Collections.swap(list, 1, 2);
	System.out.println(list);
	
   	/* 11. Write a Java program to trim the virtual capacity of an
     *  array list to the current list size.
     * 
     * 
     */
	ArrayList<String> product=new ArrayList<String>();
	product.add(0, "abc");
	product.add(1, "cde");
	product.add(2, null);
	product.add(3, "test");
	product.add(2, "priya");
	product.add(4, "");
	System.out.println(product.size());
	System.out.println(product);
	product.trimToSize();
	System.out.println(product);
	
	
	
	

	

	 

                
                

  

	}

}
