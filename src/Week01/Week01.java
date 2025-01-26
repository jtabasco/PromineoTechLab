//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  Variables & Operations Lab
// Java Week 01 Lab  
//
package Week01;
import java.util.Scanner;
public class Week01 {

	public static void main(String[] args) {
		

		
		
		System.out.println("Week 01 Lab");
		// 1. Create a variable to hold the quantity of 
		//		available plane seats left on a flight		
		int avaibleSeatsOnFlight=12;
		
		// 2. Create a variable to hold the cost of groceries at checkout
		double costGroceries = 20.45;
		
		// 3. Create a variable to hold a person's middle initial
		char meddleInitalPersons = 'J';
	
		// 4. Create a variable to hold true if it's hot outside 
		//		and false if it's cold outside
		boolean isHotOutside = false;
		
		// 5. Create a variable to hold a customer's first name
		String customerFisrtName="Joel";
		
		// 6. Create a variable to hold a street address
		String streetAddress = "8372 erickson blvd";

		// 7. Print all variables to the console
	   System.out.println("Avaible Seat: " +avaibleSeatsOnFlight);
	   System.out.println("Cost of Grosery: $"+costGroceries);
	   System.out.println("Middle Inial Name is "+meddleInitalPersons);
	   System.out.println("Is Out Side: "+isHotOutside);
	   System.out.println("Customer First Name: "+customerFisrtName);
	   System.out.println("Street Adress:"+streetAddress);

		// 8. A customer booked 2 plane seats, 
		//		remove 2 seats from the available seats variable
	   			avaibleSeatsOnFlight-=2;
	  

		// 9. Impulse candy bar purchase, add 2.15 to the grocery total
		// 		costOfGroceries = costOfGroceries + 2.15;
	   		   
	   		   costGroceries+=2.15;

		// 10.  The birth certificate was printed incorrectly, 
		//		change the middle initial to something else
			   meddleInitalPersons='D';

		// 11.  The season has changed, update the hot outside 
		//			variable to be opposite of what it was
	   			isHotOutside=!isHotOutside;

		// 12.  Create a new variable called full name using the customer's first name, 
		//			the middle initial, and a last name of your choice
	   			String fullName = customerFisrtName+" "+meddleInitalPersons+" Tabasco";
	   			
		// 13.  Print a line to the console that introduces the customer and says they live
		// 			at the address variable
	   			System.out.println("----------------");
	   			System.out.println(fullName + " live in "+streetAddress);
	   			
	   			String streetNumber = "57";
	   			String streetName = "Main Street";
	   			String cityName = "Oakland";
	   			String stateName = "NY";
	   			String zipCode = "03030";
	   			String fullAddress = streetNumber + " " + streetName + ", " + cityName + ", " + stateName + "  " + zipCode;
	   			System.out.println("Address:  " + fullAddress);
//	   		***********************
	   			for (int i = 0; i < 100; i++) {

	   			  if (i % 3 == 0) {

	   			    System.out.println(i);

	   			  }

	   			}


	}
}