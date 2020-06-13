package assignment;

import java.util.Arrays;

public class FindSecLargest {

	public static void main(String[] args) {
	
			
	int data[]= {3,2,11,4,6,7};
	
	Arrays.sort(data);
	
	System.out.println(" The Sorted Array "+ Arrays.toString(data));
	

		System.out.println("The Sec largest number " + data[data.length-2]);

		}

	}


