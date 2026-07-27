/* ---------------------

# 8. Throws Keyword

**Case Study:**
A file management system opens a text file to read its contents. Since the file may not exist, the method should declare that it can throw an exception.

**Question:**
Write a Java program that reads a file using a method declared with the 'throws' keyword and handles the exception in the calling method.

--------------------- */

import java.util.Scanner;
import java.lang.*;
import java.io.*;

class ThrowsKeywordProgram
{

 public static void readFile() throws FileNotFoundException
 {
	 File file=new File("abc.txt");
     Scanner sc=new Scanner(file);

 while(sc.hasNextLine())
 {
 System.out.println(sc.nextLine());
 }
}
public static void main(String args[])
{
try
{
readFile();
}
catch(FileNotFoundException ex)
{
System.out.println("File not found."+ex.toString());	
}
System.out.println("Program Run Successfully...!!!");
}
}