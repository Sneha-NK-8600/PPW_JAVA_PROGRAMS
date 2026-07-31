/* Q2. Write a Java program to create an ArrayList of integers. Display the first element using get(), 
replace the second element using set(), and display the updated list.*/

import java.util.*;

class ArrayListInteger
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	ArrayList<Integer> al=new ArrayList<>();
	
	System.out.println("Enter 5 Elements:");
	for(int i=0;i<5;i++)
	{
		al.add(sc.nextInt());
	}
	
	System.out.println("ArrayList Elements are:"+al);
	
	System.out.println("ArrayList First Element is:"+al.get(0));
	
	System.out.println("Enter new element to add at Second Index:");
	int newele=sc.nextInt();
	
	al.set(2,newele);
	System.out.println("New Element at Second Index is:"+newele);
	
	System.out.println("New Updated ArrayList is:"+al);
}
}