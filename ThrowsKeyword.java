/* ---------------------

# 8. Throws Keyword

**Case Study:**
A file management system opens a text file to read its contents. Since the file may not exist, the method should declare that it can throw an exception.

**Question:**
Write a Java program that reads a file using a method declared with the 'throws' keyword and handles the exception in the calling method.

--------------------- */

import java.util.Scanner;
import java.io.*;

class ThrowsKeyword
{
public static void main(String args[])
{

try
{
	FileReader file=new FileReader("abc.txt");
}
catch(FileNotFoundException ex)
{
System.out.println(ex.getMessage());	
}
System.out.println("Program Run Successfully...!!!");
}
}
