package assignment;

public class ReverseEvenPosition {


		
	/*	Build a logic to reverse the even position words (output: I ma a erawtfos tester)

		 Pseudo Code:
			 
		 * Declare the input as Follow
		 * String test="I am a software tester"; 
		 * split the words and have it in an array
		 * Traverse through each word (using loop)
		 * find the odd index within the loop (use mod operator)
		 * split the words and have it in an array
		 * print the even position words in reverse order using another loop (nested loop)
		 * Convert words to character array if the position is even else print the word as it is(concatenate space at the end).
*/
	public static void main(String[] args) {
		

		String test = "I am a Software Tester";
		String[] splitString = test.split(" ");
		String finalString = "";
		
		
		for (int i = 0; i < splitString.length; i++) {
			
			if (i % 2 != 0) {
				
				String actual = splitString[i];
		
				String reverse = "";
				
				for (int j = actual.length() - 1; j >= 0; j--) {
					
					reverse += actual.charAt(j);

				}
				finalString += reverse + " ";

			} else {
				finalString += splitString[i] + " ";
				

			}

		
		}
		
		System.out.print("finalString=>" + finalString);

	}

}
