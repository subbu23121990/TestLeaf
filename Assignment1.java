package assignment;

public class Assignment1 {
	
	public static void main(String args[]) {
	int a=203;
	int sum = 0;
	
	for (int i=0;i<=a;i++)
	{
		int rem=a%10;
		System.out.println("Remainder is "+rem);
		sum +=rem;
		System.out.println("Sum is "+sum);
		a=a/10;
		System.out.println("Quotinent is "+a);
		
	}

	System.out.println("The final sum of given number is "+sum);
	}
	
	

}
