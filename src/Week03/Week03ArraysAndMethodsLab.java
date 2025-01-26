//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject: Arrays & Methods
// Java Week 03 Lab
//
package Week03;

import java.util.Scanner;

public class Week03ArraysAndMethodsLab {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
			
		//
		// Arrays:
		//
		
		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
			int[] array= {1,5,2,8,13,6};
		
		// 2. Print out the first element in the array
	        System.out.println("2. First element in the array: "+ array[0]);
	      
		
		// 3. Print out the last element in the array without using the number 5
	        System.out.println("3. Last element in the array: "+array[array.length-1]);
		
		// 4. Print out the element in the array at position 6, what happens?
	        //System.out.println(array[6]);  //Out off index
		
		// 5. Print out the element in the array at position -1, what happens?
	        //System.out.println(array[-1]);  //Out off index
			
		// 6. Write a traditional for loop that prints out each element in the array
	        System.out.println("6. Elements in the array(traditional)");
	        for (int i=0;i<array.length;i++) {
	        	System.out.println(array[i]);
	        }
	        	
			
		// 7. Write an enhanced for loop that prints out each element in the array
	        System.out.println("7. Elements in the array(enhanced)");	
	        for (int element : array) {
	        		System.out.println(element);
	        	}
		
		// 8. Create a new variable called sum, write a loop that adds 
		//			each element in the array to the sum
           double sum =0;
           for (int element : array) {
       		sum+=element;
       	}
           System.out.println("8. Sum of array: "+sum);
			
		// 9. Create a new variable called average and assign the average value of the array to it
           double average=sum/(array.length);
           
           System.out.println("9. Average of the array: "+average);
           
		
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd
           System.out.println("10. Odd element of the array");	
	        for (int element : array) {
	        	  if (element % 2 !=0)
	        		System.out.println(element);
	        	}
		
		
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
	        String[] names = {"Sam", "Sally", "Thomas", "Robert"};
	        for (String name : names) {
				System.out.println(name);
			}
		
		// 12. Calculate the sum of all the letters in the new array
	        int sumOffLetters=0;
	        for (String letter : names) {
	        	sumOffLetters+=	letter.length();
	        	}
	        System.out.println("12. Sum off all letters of the array: "+sumOffLetters );

		//
		// Methods:
		//
		
		// 13. Write and test a method that takes a String name and prints out a greeting. 
		//			This method returns nothing.
	        //getAName();
		
		// 14. Write and test a method that takes a String name and  
		//			returns a greeting.  Do not print in the method.
           // System.out.println(getNameWithGreeting()); 
		
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods.
		//		b. What do you find? 
		//		c. How are they different?
		    /*
		     *  a.The first method does not return anything, while the second returns data
		     *  b.Both can be used interchangeably depending on what is needed
		     *  c.The first method we can't change your answer instead the second one can use the answer on other things
		     */
		
		// 15. Write and test a method that takes a String and an int and 
		//			returns true if the number of letters in the string is greater than the int
           // System.out.println("15. if number of letters in the string is greater than the number: "+ isNumberOffLettersGreatThanInt());
		
		// 16. Write and test a method that takes an array of string and a string and 
		//			returns true if the string passed in exists in the array
           // System.out.println("16. if the string in array: "+ isStringInArray());
		
		// 17. Write and test a method that takes an array of int and 
		//			returns the smallest number in the array
            //System.out.println("17. the smallest number in the array: "+ smallestNumInArray());
		
		// 18. Write and test a method that takes an array of double and 
		//			returns the average
		    //System.out.println("18. the average off the array is : "+ averageOffTheArray());

		// 19. Write and test a method that takes an array of Strings and 
		//			returns an array of int where each element
		//			matches the length of the string at that position
             //System.out.println("19. "+arrayOffInt());
				
		// 20. Write and test a method that takes an array of strings and 
		//			returns true if the sum of letters for all strings with an even amount of letters
		//			is greater than the sum of those with an odd amount of letters.
	       // System.out.println("20.the sum of letters for all strings with an even amount of letters\r\n"
	       // 		+ "is greater than the sum of those with an odd amount of letters: "+isSumOffEvenGreatThanSumOffOdd());
	
		// 21. Write and test a method that takes a string and 
		//			returns true if the string is a palindrome
	        System.out.println("21. The string is a palindrome? "+isPalindrome());
		
		
	}
	
	





	// Method 13:
	//13. Write and test a method that takes a String name and prints out a greeting. 
	//			This method returns nothing.
	public static void getAName() {
		System.out.print("Enter a Name: ");
		String name = sc.nextLine();
		System.out.println("Welcome "+ name);
	}

	// Method 14:
	private static String getNameWithGreeting() {
		System.out.print("Enter a Name: ");
		String name = sc.nextLine();
		return "Welcome Again "+name;
	}
	
	// Method 15:

	private static boolean isNumberOffLettersGreatThanInt() {
		System.out.print("Enter a Name: ");
		String name = sc.nextLine();
		int numOffLetters = name.length();
		System.out.print("Enter a number: ");
		int num =sc.nextInt();
		if (numOffLetters>num)
			return true;
		else
			return false;
	}
	
	// Method 16:
	private static boolean isStringInArray() {
		
		Scanner ssc = new Scanner(System.in); 
		String[] arrayName = new String[5];
		 for (int index = 0; index < 5; index++) {
	            System.out.print("Type string to add it to the array: ");
	            arrayName[index] = ssc.nextLine();
	        }
		
		System.out.println("Type string to search: ");
		String searchString = ssc.nextLine();
	
		 
		 for (String str: arrayName) {
			 if (str.equals(searchString)) {
	                return true;
	            }
		 }
		 ssc.close();
		 return false;
		 
	}
	
	// Method 17:

	private static int smallestNumInArray() {
		Scanner si = new Scanner(System.in); 
		int[] arrayInt = new int[5];
		 for (int index = 0; index < 5; index++) {
	            System.out.print("Type num to add it to the array: ");
	            arrayInt[index] = si.nextInt();
	        }
		 
		 int smallNumber=arrayInt[0];
		 	 
		 for (int num: arrayInt) {
			 if (num<smallNumber) {
				 smallNumber=num;
	            }
		 }
		 si.close();
		 return smallNumber;
	}
	
	// Method 18:
	private static double averageOffTheArray() {
	    Scanner sd = new Scanner(System.in); 
	    double[] arrayDouble = new double[5];
	    double sumOffArray = 0;

	    for (int index = 0; index < 5; index++) {
	        System.out.print("Type double to add it to the array: ");
	        arrayDouble[index] = sd.nextDouble();
	        sumOffArray += arrayDouble[index]; // Add to sum directly
	    }

	    return sumOffArray / arrayDouble.length;
	}
	
	// Method 19:
	private static int[] arrayOffInt() {
		Scanner sst = new Scanner(System.in); 
		String[] arrayName = new String[5];
		int[] arrayInt = new int[5];
		 for (int index = 0; index < 5; index++) {
	            System.out.print("Type string to add it to the array: ");
	            arrayName[index] = sst.nextLine();
	            arrayInt[index]=arrayName[index].length();
	        }
		return arrayInt;
	}
	
	// Method 20:
	private static boolean isSumOffEvenGreatThanSumOffOdd() {
		Scanner sst = new Scanner(System.in); 
		String[] arrayName = new String[5];
		int sumOffEven=0;
		int SumOffOdd=0;
		 for (int index = 0; index < 5; index++) {
	            System.out.print("Type string to add it to the array: ");
	            arrayName[index] = sst.nextLine();
	            if (arrayName[index].length() % 2 ==0)
	            	sumOffEven+=arrayName[index].length();
	            else
	            	SumOffOdd+=arrayName[index].length();
	        }
		 return  sumOffEven>SumOffOdd;
		
	
	}
	
	// Method 21:
	private static boolean isPalindrome() {
	    Scanner sst = new Scanner(System.in);
	    System.out.println("Type string :");
	    String word = sst.nextLine();
	    String backWord = "";

	    for (int i = word.length() - 1; i >= 0; i--) {
	        backWord += word.charAt(i);
	    }

	    return backWord.equals(word); // Check if reversed string is equal to original
	}

}