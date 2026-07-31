/* A Collection is an interface that represents a group of objects, known as elements. 

It provides methods to perform common operations like:

Adding elements
Removing elements
Searching for elements
Iterating through elements
Checking the size of the collection */

/* Q1. Write a Java program to create an ArrayList of student names. Add 5 names and display all the names. */

import java.util.*;

class ArrayListString
{
public static void main(String args[])
{
ArrayList<String> al=new ArrayList<>();

// Adding data into ArrayList 
al.add("Sneha");
al.add("Sakshi");
al.add("Vaishnavi");
al.add("Pooja");
al.add("Sayali");

// Printing ArrayList data 
System.out.println("Name of Students:"+al);
}
}

