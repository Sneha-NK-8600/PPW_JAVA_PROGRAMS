/* Q3. Write a Java program to create a Vector of fruits. Remove one fruit using remove() 
and display the remaining elements using an Iterator. */


import java.util.*;

class VectorsFruits
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 Vector<String> vc=new Vector<>();
 
 System.out.println("Enter 5 Fruits Names:");
 for(int i=0;i<5;i++)
 {
	 vc.add(sc.next());
 }
 
 System.out.println("Vectors Elements are:"+vc);
 
 System.out.println("Enter Fruit Name to Remove:");
 String name=sc.next();
 
 vc.remove(name);
 
 System.out.println("After Removing Fruit Vector is: "+vc);
 
}
}
