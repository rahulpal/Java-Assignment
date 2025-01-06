package Day_7;



public class SumCmdLine 
{
	public static void main(String[] args)
	{
		int sum = 0;
		if(args.length != 3)
		{
			System.out.println("Kindly enter only 3 arguments as inputs through command line for addition");
		}
		else
		{
			try {
		for(int i = 0 ; i < args.length ; i++)
		{
			 sum = sum + Integer.parseInt(args[i]);
		}
		System.out.println("Addition of 3 numbers is : " + sum);
			}
			catch(NumberFormatException e)
			{
				System.out.println("Kindly enter integer as input for addition");
			}
	}
	

}
}


