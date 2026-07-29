package org.techHub;
import java.sql.*;
import java.util.Scanner;


public class JDBCApplication {

	public static void main(String[] args) throws Exception {
		
		// Load and Register the driver 
		
   com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
   DriverManager.registerDriver(d);
   System.out.println("Driver Registered Successfullay...!!!"); 
   
   // Establish the Connection
   
   Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/Student", "root", "Root");
   
   if(conn != null)
   {
	   System.out.println("Connection Successfully...!!!");
	   
	   Scanner sc=new Scanner(System.in);
	   Statement stmt=conn.createStatement();
	   
	   /*   Inserting data into StudentInfo  table 
	   
	   System.out.println("Enter Student Name:");
	   String name=sc.nextLine();
	   
	   System.out.println("Enter Student Roll no:");
	   int rollno=sc.nextInt();
	   sc.nextLine();          
	   
	   System.out.println("Enter Student Department:");
	   String dept=sc.nextLine(); 
	   
	   int result=stmt.executeUpdate("insert into StudentInfo values("+rollno+",'"+name+"','"+dept+"')"); 
	   
	   if(result>0)
	   {
		   System.out.println("Data Inserted Successfully...!!!");
	   }
	   
	   else
	   {
		   System.out.println("Data Not Inserted ...!!!"); 
	   }
	   */
	   
	   
	   // Deleting data from StudentInfo table 
	   
	  /*  System.out.println("Enter Student Roll no to Delete Record:");
	   int delrec=sc.nextInt();
	   
	   int result=stmt.executeUpdate("delete from StudentInfo where SID="+delrec+" ");
	   
	   if(result>0)
	   {
		   System.out.println("Record Deleted Successfully...!!!");
	   }
	   
	   else
	   {
		   System.out.println("Record Not Deleted ...!!!"); 
	   }    */
	   
	   /* 
	    
	   // Updating Data from the StudentInfo table 
	   
	   System.out.println("Enter Student Roll no to Update Data:");
	   int rno=sc.nextInt();
	   sc.nextLine();
	   
	   System.out.println("Enter New Name of Student:");
	   String newname=sc.nextLine();
	   
	   System.out.println("Enter New Department of Student:");
	   String newdept=sc.nextLine();
	  
	   
	   int result=stmt.executeUpdate("update StudentInfo set SName='"+newname+"', SDept='"+newdept+"' where SID="+rno+" ");
	   
	   if(result>0)
	   {
		   System.out.println("Record Updated Successfully...!!!");
	   }
	   else   
	   {
		  System.out.println("Record Not Updated...!!!"); 
	   }   */
	   
	   // Fetching Records from StudentInfo table
	   
	   ResultSet rs=stmt.executeQuery("select * from StudentInfo");
	   
	   while(rs.next())
	   {
		   System.out.println(rs.getInt("SID")+"\t"+rs.getString("SName")+"\t"+rs.getString("SDept"));
	   }
   }
   else
   {
	   System.out.println("Connection Failed...!!!");
   }  
   
	}

}
