/* Q5. Write a Java program to create a Vector of colors. Display all elements using an Iterator, 
remove all elements using clear(), and verify whether the vector is empty using isEmpty(). */

import java.util.*;

class VectorColors
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
 Vector<String> vc=new Vector<>();
 
 System.out.println("Enter 5 Colors Name:");
       for(int i=0;i<5;i++)
        {
	     vc.add(sc.next());
        }
		System.out.println("Colors in the Vector are:");
   Iterator<String> itr=vc.iterator();
   
   while(itr.hasNext())
   {
	   System.out.println(itr.next());
   }
   
 
   vc.clear();
    System.out.println("After Clearing the all colors from the Vector:"+vc);
   
   boolean empty=vc.isEmpty();
   System.out.println("Checking Whether the Vector is Empty: "+empty);

}

}