package assignment;

import java.util.Arrays;

public class Anagram {
	
	
/*	 Pseudo code 
	 
 	 * Declare a String 
	      String text1 = "stops";
	 * Declare another String
	      String text2 = "potss"; 
 	 * a) Check length of the strings are same then (Use A Condition)
	 * b) Convert both Strings in to characters
 	 * c) Sort Both the arrays
 	 * d) Check both the arrays has same value*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text1="stops";
		String text2="potss";

		if(text1.length()==text2.length())
		{
			
		 char[] array1 = text1.toCharArray();
		 
		 Arrays.sort(array1);
		 
		 System.out.println(array1);
		 
		 char[] array2 = text2.toCharArray();
		 
		 Arrays.sort(array2);
		 
		 System.out.println(array2);
		 
		 if (Arrays.equals(array1, array2))
		 {
			 System.out.println("It is an anagram");
			}
		 else
		 {
			 System.out.println("It is not an anagram");
		 }
		}

		else
		{
			System.out.println("String length is different");
		}

			}
		
		
	

}
