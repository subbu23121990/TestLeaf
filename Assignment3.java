package assignment;

public class Assignment3 {
	public static void main(String args[])
	{
		int num=8;
		int firstnum=0;
		int secondnum=1;
		
		for(int i=1;i<=num;i++)
		{
			System.out.println(firstnum);
			int sum=firstnum+secondnum;
			firstnum=secondnum;
			secondnum=sum;
		}
	}

}
