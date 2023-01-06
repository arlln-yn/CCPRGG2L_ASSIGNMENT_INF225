package Assignments;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Assignment_1_ShorterMethod {

	public static void main(String[] args) {

// Shorter Method
		// Student Email
	  Scanner scan = new Scanner(System.in);
	  System.out.print("Enter student email: ");
	  String studentEmail = scan.nextLine();
	        
	  boolean match = Pattern.matches("\\w+@students.national-u.edu.ph", studentEmail);

	     	if (match) 
	     	{
	            System.out.println("valid student email");
	        } 
	     	else 
	        {
	            System.out.println("invalid student email");
	        }
	     	
	    // Student Phone Number
	  System.out.print("Enter student phone number: ");
	  String studentPhoneNum = scan.nextLine();
	  
	  boolean match1 = Pattern.matches("09\\d{9}", studentPhoneNum);

	  		if (match1) 
	  		{
	  			System.out.println("valid student phone number");
	  		} 
	  		else 
	  		{
	  			System.out.println("invalid student phone number");
	  		}
	}
}