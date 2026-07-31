/* Q3. Write a Java program to create an ArrayList of cities. Remove one city using remove(), 
check whether a city exists using contains(), and display the list. */

import java.util.*;

class ArrayListCities
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
   ArrayList<String> al=new ArrayList<>();

System.out.println("Enter 5 City Name:");
for(int i=0;i<5;i++)
{
	al.add(sc.next());
}	
System.out.println("Cities Before Removing the City from ArrayList:"+al);

System.out.println("Enter City Name to Remove:");
String cname=sc.next();

boolean res=al.contains(cname);

if(res)
{
	System.out.println("City Exist");
}
else
{
	System.out.println("City Not Exist");
}

if(res)
{
	al.remove(cname);
}

System.out.println("Updated City Name List:"+al);
}
}

