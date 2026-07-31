/* Q1. Write a Java program to create a Vector of employee names. Add 5 names and display them using an Iterator. */

import java.util.*;

class VectorEmployee
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Vector<String> vc=new Vector<>();

System.out.println("Enter 5 Employees Names:");
for(int i=0;i<5;i++)
{
	vc.add(sc.next());
}

Iterator<String> itr=vc.iterator();

System.out.println("Employee Names Are:");
while(itr.hasNext())
{
	System.out.println(itr.next());
}
}
}
