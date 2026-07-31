/* Q4. Write a Java program to create a Vector of strings. Check whether a given element exists using contains(),
 display the total number of elements using size(), and print all elements using an Iterator. */
 
 import java.util.*;
 
 class VectorString
 {
 public static void main(String args[])
 {
 Scanner sc=new Scanner(System.in);
 Vector<String> vc=new Vector<>();
  
 System.out.println("Enter 5 City Name:");
for(int i=0;i<5;i++)
{
	vc.add(sc.next());
}	

System.out.println("Enter City name to check whether it Exist:");
String cname=sc.next();

boolean res=vc.contains(cname);

if(res)
{
	System.out.println("City Exist");
}
else
{
	System.out.println("City Not Exist");
}

System.out.println("Size of Vector is: "+vc.size());

System.out.println("Vectors Elements are:");

Iterator<String> itr=vc.iterator();

while(itr.hasNext())
{
	System.out.println(itr.next());
}

 }
 }
