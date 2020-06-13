package assignment;

public class ChangeOddIndexToUppercase {
	
	 /*Pseudo Code
	 
		* Declare String Input as Follow
	 	* String test = "changeme";
		* a) Convert the String to character array
		* b) Traverse through each character (using loop)
	 	* c)find the odd index within the loop (use mod operator)
	 	* d)within the loop, change the character to uppercase, if the index is odd else don't change
*/
	public static void main(String[] args) {
		
		String test="changeme";
		
		char[] texttochararr = test.toCharArray();
		
		String finalstring= " ";
		
		for(int i=0;i<texttochararr.length;i++)
		{
			if(i%2==0)
			{
				char upperCase = Character.toUpperCase(texttochararr[i]);
			    finalstring= finalstring+upperCase;
			}
			else
			{
			 char c = texttochararr[i];
				finalstring= finalstring+c;
			}
		}
		System.out.println("Odd Index value changed to Upper case"+finalstring);
			}
		

	

}
