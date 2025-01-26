//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  StringBuilders, Lists, Sets, & Maps
// Java Week 04 Lab  
//
package Week04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.print.DocFlavor.STRING;

public class Week04StringBuilderListSetMapLab {

	public static void main(String[] args) {

		// 1. Why would we use a StringBuilder instead of a String?
		// 		a. Instantiate a new StringBuilder
		//		b. Append the characters 0 through 9 to it separated by dashes
		// 				Note:  make sure no dash appears at the end of the StringBuilder
			StringBuilder sb =new StringBuilder();
			for (int i=0;i<=9;i++) {
				if (i !=9)
					sb.append(i+"-");
				else 
				sb.append(i);
			}
			System.out.println("1." +sb.toString());
			
		// 2. List of String:
		//		a. Create a list of Strings 
		//		b. Add 5 Strings to it, each with a different length
			List<String> strings = new ArrayList<String>();
			strings.add("Wiliam");
			strings.add("Hello");
			strings.add("Sam");
			strings.add("Joel");
			strings.add("Justin");
			System.out.println("2." + strings);
		// 3. Write and test a method that takes a list of strings 
		//			and returns the shortest string
			System.out.println("3. The shortest string is: "+shortestString(strings));
		
		// 4. Write and test a method that takes a list of strings 
		//			and returns the list with the first and last element switched
			System.out.println("4. List Update : "+switchedEelement(strings));
		
		// 5. Write and test a method that takes a list of strings 
		//			and returns a string with all the list elements concatenated to each other,
		// 			separated by a comma
			System.out.println("5. List of the string separeted by comma : "+ listOfStringSeparetedByComma(strings));
		
		// 6. Write and test a method that takes a list of strings and a string 
		//			and returns a new list with all strings from the original list
		// 			containing the second string parameter (i.e. like a search method)
			String shearch ="a";
			System.out.println("6. List containing "+shearch+" "+ shearchedList(strings,shearch));
		
		// 7. Write and test a method that takes a list of integers 
		//			and returns a List<List<Integer>> with the following conditions specified
		//			for the return value:
		//		a. The first List in the returned value contains any number from the input list 
		//			that is divisible by 2
		//		b. The second List contains values from the input list that are divisible by 3
		//		c. The third containing values divisible by 5, and 
		//		d. The fourth all numbers from the input List not divisible by 2, 3, or 5
		List<Integer> numbers =Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,22,12,15,13,23,25);
		List<List<Integer>> sortedNumbers =listOfDivison(numbers);
		System.out.println("7. Sorted list");
		for(List<Integer> list : sortedNumbers) {// interactuo con cada lista
			System.out.println("List ------");
			for (Integer num : list) {
				System.out.println(num);
			}
		}
		
		// 8. Write and test a method that takes a list of strings 
		//			and returns a list of integers that contains the length of each string
		
		System.out.println("8. List of Integer hat contains the length of each string: ");
		System.out.println(strings.toString());
		List<Integer> lengthOffString = arrayLengthOffString(strings);
		for (Integer nu : lengthOffString) {
			System.out.println(nu);
		}
		
		// 9. Create a set of strings and add 5 values

		Set<String> setString = new HashSet<String>();
		setString.add("Hello");
		setString.add("Hero");
		setString.add("Welcome");
		setString.add("Next");
		setString.add("aCountry");
		
		// 10. Write and test a method that takes a set of strings and a character 
		//			and returns a set of strings consisting of all the strings in the
		// 			input set that start with the character parameter.
		char ch ='a';
		System.out.println("10. new set off string begin with char "+ch);
		Set<String> firstLetter = newSetOffString(setString,ch);
		for (String str : firstLetter) {
			System.out.println(str);
		}
		// 11. Write and test a method that takes a set of strings 
		//			and returns a list of the same strings
		System.out.println("11. List of string");
		List<String> listOffNewString= listOffStringOffSet(setString);
		for(String sts : listOffNewString) {
			System.out.println(sts);
		}
		

		// 12. Write and test a method that takes a set of integers 
		//			and returns a new set of integers containing only even numbers 
		//			from the original set

		Set<Integer> numInteger = new HashSet<Integer>();
		numInteger.add(5);
		numInteger.add(0);
		numInteger.add(3);
		numInteger.add(4);
		numInteger.add(8);
		numInteger.add(15);
		numInteger.add(11);
		
		System.out.println("12. Set of Integer even");
		Set<Integer> setOffInteger= listOffInteger(numInteger);
		for(Integer sts : setOffInteger) {
			System.out.println(sts);
		}
		
		// 13. Create a map of string and string and add 3 items to it where the key of each
		// 			is a word and the value is the definition of the word

		Map<String,String> mapString = new HashMap<String, String>();
		mapString.put("Freedom", "the state of not being imprisoned or enslaved.");
		mapString.put("Python","a programming language that's used to create software, websites, and analyze data.");
		mapString.put("Umbrela","a device consisting of a circular canopy of cloth on a folding metal frame supported by a central rod, used as protection against rain or sometimes sun.");
		
		// 14. Write and test a method that takes a Map<String, String> and a string 
		// 			and returns the value for a key in the map that matches the
		// 			string parameter (i.e. like a language dictionary lookup)
		String meaningOfTheWord= "Python";
		System.out.println("14. Meaning of the word: "+meaningOfTheWord);
		System.out.println(meaningOfTheWordSearch(mapString,meaningOfTheWord));
		
		
		// 15. Write and test a method that takes a List<String> 
		//			and returns a Map<Character, Integer> containing a count of 
		//			all the strings that start with a given character
		
		System.out.println("15. ount of all the strings that start with a given character");
		Map<Character, Integer> returnMap = countOfSringBegunWithSameLetter(strings);
		for (Character  chart : returnMap.keySet()) {
			System.out.println(chart+": "+ returnMap.get(chart));
		}

	}

	private static Map<Character, Integer> countOfSringBegunWithSameLetter(List<String> list) {
		Map<Character, Integer> result = new HashMap<Character, Integer>();
			for (String string : list) {
				char ch =string.charAt(0);
				if (result.get(ch)== null) {
					result.put(ch, 1);
				} else {
					result.put(ch,result.get(ch)+1);
					}
				}
			return result;
			}
		
	

	private static String meaningOfTheWordSearch(Map<String, String> map, String str) {
		for (String strmap :map.keySet()) {
			if(strmap.equals(str)) {
				return map.get(strmap);
			}
		}
		return str+ " not in dictionary."; 
	}

	private static Set<Integer> listOffInteger(Set<Integer> numInteger) {
		Set<Integer> result = new HashSet<Integer>();
		  for(Integer num : numInteger) {
			  if (num % 2 ==0) {//even
				  result.add(num);
			  }
		  }
		return result;
	}

	private static List<String> listOffStringOffSet(Set<String> set) {
		List<String> st =new ArrayList<String>();
		for(String str : set) {
			st.add(str);
		}
		return st;
	}

	private static Set<String> newSetOffString(Set<String> setString, char c) {
		Set<String> newSt = new HashSet<String>();
		for(String str : setString){
			if(str.charAt(0)==c) {
				newSt.add(str);
			}
		}
		return newSt;
	}

	private static List<Integer> arrayLengthOffString(List<String> strings) {
		List<Integer> numbers = new ArrayList<Integer>();
		for(String str : strings) {
			numbers.add(str.length());
		}
		return numbers;
	}

	private static List<List<Integer>> listOfDivison(List<Integer> list){
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> listDivBy2 = new ArrayList<Integer>();
		List<Integer> listDivBy3 = new ArrayList<Integer>();
		List<Integer> listDivBy5 = new ArrayList<Integer>();
		List<Integer> listNotDivBy235 = new ArrayList<Integer>();
		
		for (Integer num : list) {
			if (num % 2 ==0) // num div by 2
				listDivBy2.add(num);
			else if (num % 3 ==0) // num div by 3
				listDivBy3.add(num);
			else if (num % 5 ==0) // num div by 5
				listDivBy5.add(num);
			else
					listNotDivBy235.add(num);	
		}
		result.add(listDivBy2);
		result.add(listDivBy3);
		result.add(listDivBy5);
		result.add(listNotDivBy235);
		return result;
		
	}
	private static List<String> shearchedList(List<String> list, String shearch) {
		List<String> results = new ArrayList<String>();
		for (String string : list) {
			if (string.contains(shearch))
				results.add(string);
		}
		return results;
	}

	private static String listOfStringSeparetedByComma(List<String> list) {
		String listOffString="";
			for( String string : list) {
			   listOffString+=string+",";
			}
			listOffString=listOffString.substring(0, listOffString.length()-1);
		return listOffString;
	}

	private static List<String> switchedEelement(List<String> list) {
		String temp=list.get(0);
		list.set(0, list.get(list.size()-1));
		list.set(list.size()-1, temp);
		return list;
	}

	private static String shortestString(List<String> list) {
		String low=list.get(0);
		
		for (String string : list) {
		  if (string.length() < low.length())
			  low=string;
		  
		}
		return low;
	}
	
	
	// Method 15:
	
	
	
	// Method 14:
	

	
	// Method 12:
	

	
	// Method 11:
	


	// Method 10:
	

	
	// Method 8:
	

	
	// Method 7:
	

	
	// Method 6:
	

	
	// Method 5:
	
	
	
	// Method 4:
	
	
	
	// Method 3:
	
	

}