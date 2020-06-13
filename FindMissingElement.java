package assignment;

import java.util.Arrays;

public class FindMissingElement 
{

	public static void main(String[] args) 
	{
		

		int data[]= { 1, 2, 3, 4, 7, 6, 8 };
		
	
		Arrays.sort(data);
		System.out.println(" The Sorted Array "+ Arrays.toString(data));
		

		for(int i=1;i <data.length; i++)
		{
			if(i != data[i-1])
			{
				System.out.println("The missing number is "+i);
				break;
				
			}
		}
			
		
	}

}
