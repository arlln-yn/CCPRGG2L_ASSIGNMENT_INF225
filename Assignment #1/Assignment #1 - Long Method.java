package Assignments;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Assignment_1 {

	public static void main(String[] args) {

	// Long Method
	    // Student Email
	    Scanner scan = new Scanner(System.in);
	    System.out.print("Enter student email: ");
	    String studentEmail = scan.nextLine();

	    Pattern pattern = Pattern.compile("\\w+@students.national-u.edu.ph");
	    Matcher matcher = pattern.matcher(studentEmail);

	    boolean match = matcher.matches();

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
	        
	    Pattern pattern1 = Pattern.compile("\\+639\\d{9}");
	    Matcher matcher1 = pattern1.matcher(studentPhoneNum);

	    boolean match1 = matcher1.matches();

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
