/* Q4. Write a Java program to create an ArrayList of strings. Find the index of a given element using indexOf(),
 display the size of the list using size(), and check whether the list is empty using isEmpty(). */
 
 import java.util.*;
 
 class ArrayListStringProgram
 {
	 public static void main(String args[])
	 {
		Scanner sc=new Scanner(System.in);
        ArrayList<String> al=new ArrayList<>();
        
        System.out.println("Enter 5 Students Name:");
		for(int i=0;i<5;i++)
        {
	     al.add(sc.next());
        }
		
		System.out.println("Name od Students:"+al);
		
		System.out.println("Enter Name of Student nto check whether it is present or not:");
		String name=sc.next();
		
		System.out.println("Index of "+name+" is: "+al.indexOf(name));
		
		System.out.println("Size of ArrayList is:"+al.size());
		
		boolean empty=al.isEmpty();
	    System.out.println("Checking Whether the ArrayList is Empty: "+empty);
			
	 }
 }
