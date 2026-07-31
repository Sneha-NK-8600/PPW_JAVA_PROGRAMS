/* Q5. Write a Java program to create an ArrayList of colors. Display all elements using an Iterator,
 then remove all elements using clear() and check whether the list is empty. */
 
 import java.util.*;
 
 class ArrayListColors
 {
 public static void main(String args[])
 {
 Scanner sc=new Scanner(System.in);
 ArrayList<String> al=new ArrayList<>();
 
 System.out.println("Enter 5 Colors Name:");
       for(int i=0;i<5;i++)
        {
	     al.add(sc.next());
        }
		System.out.println("Colors in the ArrayList are:");
   Iterator<String> itr=al.iterator();
   
   while(itr.hasNext())
   {
	   System.out.println(itr.next());
   }
   
 
   al.clear();
    System.out.println("After Clearing the all colors from the ArrayList:"+al);
   
   boolean empty=al.isEmpty();
   System.out.println("Checking Whether the ArrayList is Empty: "+empty);
 }
 }
