/* Q2. Write a Java program to create a Vector of integers.
 Retrieve an element using get(), update it using set(), 
and display all elements using an Iterator. */

import java.util.*;

class VectorInteger
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Vector<Integer> vc=new Vector<>();

System.out.println("Enter 5 Elements:");
for(int i=0;i<5;i++)
{
	vc.add(sc.nextInt());
}
System.out.println("Vectors Elements are:"+vc);

System.out.println("Enter Index to get an Element:");
int idx=sc.nextInt();

System.out.println("Element at "+idx+" is: "+vc.get(idx));

System.out.println("Enter Index and Element to set new Value:");
int index=sc.nextInt();
int ele=sc.nextInt();

System.out.println("Setting New Element at Index "+index+"and Element is:");
vc.set(index,ele);

System.out.println("After Updating Vectors Elements are:");
Iterator<Integer> itr=vc.iterator();

while(itr.hasNext())
{
	System.out.println(itr.next());
}

}
}
