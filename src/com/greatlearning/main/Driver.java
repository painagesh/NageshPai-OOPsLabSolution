package com.greatlearning.main;

import java.util.Scanner;
import com.greatlearning.model.*;
import com.greatlearning.service.*;


public class Driver {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String firstName, lastName;
		int choice; // for entering department id
		
		
		
		System.out.println("Enter your first name");
		firstName = sc.next();
		
		System.out.println("Enter your last name");
		lastName = sc.next();
		
		System.out.println("Choose your department from below options:");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		choice = sc.nextInt();
		
		Employee obj;
		
		switch (choice) {
		
		case 1: obj = new Employee (firstName, lastName, "tech"); break;
		
		case 2: obj = new Employee (firstName, lastName, "adm"); break;
		
		case 3: obj = new Employee (firstName, lastName, "hr"); break;
		
		case 4: obj = new Employee (firstName, lastName, "lg"); break;
		
		default: System.out.println("Wrong choice"); return;
		
		}
		

		
		CredentialService cs = new CredentialService();
		
		String email = cs.generateEmailAddress(obj);
		//System.out.println("Email address is "+email);
		
		String password = cs.generatePassword();
		//System.out.println("Password "+password);
		
		cs.showCredentials(obj, email, password);
		
	
		
	}

}
