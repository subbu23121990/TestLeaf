package assignment;

public class PrimeNumber {

	public static void main(String[] args) {

/*To find whether a number is a Prime number or not

		Pseudo code:
		* input: 13
	 	* output: 13 is a Prime Number
		* Declare an int Input and assign a value
		* Declare a boolean input as flag
		* Iterate from 1 to half of the input
		* Divide the input with each for loop variable and check the remainder
		* Set the flag as true when there is no remainder
		* break the iterator
		* Check the flag (Provide a condition)
		* Print 'Prime' when the condition matches
		* Print 'Not a Prime' when the condition doesn't match
		
*/
	
		int number =13;
		if(number%2==0||number%3 ==0||number%5==0||number%7==0)
		{
			System.out.println("The given number is not a prime number");
		}
		else
		{
			System.out.println("The given number is a prime number");
		}
	
	
	}

}
