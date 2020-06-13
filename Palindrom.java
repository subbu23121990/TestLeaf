package assignment;

public class Palindrom {
	
	/*Build a logic to find the given string is palinDrome or not
	
	 Pseudo Code

	* a) Declare A String value as"madam"
	* b) Declare another String rev value as ""
	* c) Iterate over the String in reverse order
	* d) Add the char into rev
	* e) Compare the original String with the reversed String, if it is same then print palinDrome 
	* Hint: Use .equals or .equalsIgnoreCase when you compare a String */


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String input="MADAM";
		String rev="";
		for(int i=input.length()-1;i>=0;i--)
		{
			rev= rev+ input.charAt(i);
		}
		if(input.equals(rev))
		{
			System.out.println(" Entered input is a palindrome");
		}
		else
		{
			System.out.println("Entered input is not a palindrome");
		}

		
	}

}
