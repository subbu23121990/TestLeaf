package assignment;

public class RemoveDuplicate {

	
	/*RemoveDuplicates 
	 Pseudo code 

	* a) Use the declared String text as input
		
		String text = "We learn java basics as part of java sessions in java week1";		

	* b) Initialize an integer variable as count	  
	* c) Split the String into array and iterate over it 
	* d) Initialize another loop to check whether the word is there in the array
	* e) if it is available then increase and count by 1. 
	* f) if the count > 1 then replace the word as "" 
 	* g)Displaying the String without duplicate words	
	* h) print the each word*/
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String text = "We learn java basics as part of java sessions in java week1";
		int count = 0;
		String Text4 = "";
		String[] newText=text.split(" ");
		
		for(int i=0;i<newText.length;i++) {
			
			while((newText[i]).equals("java")) {
				count = count +1;
				
				if(count>1) {
					Text4=text.replaceAll(newText[i], "");
					break;
				}
			}
			
		}
		System.out.println(Text4);

	}

}
