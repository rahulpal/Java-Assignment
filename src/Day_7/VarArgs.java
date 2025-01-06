
/* create a class "Demo" with "disp()" which can take variable number of int arguments and display the sum of all numbers
  passed to it. invoke "disp()" from main function.
  */ 
package Day_7;


class Demo
{
	int sum = 0;
	void disp(int ... arg)
	{
		for(int i = 0 ; i < arg.length ; i++)
		{
		sum = sum + arg[i];
		}
		System.out.println("Sum of all the numbers is : " + sum);
	}
}
public class VarArgs
{
  public static void main(String[] args)
  {
	  Demo d = new Demo();
	  d.disp(2, 3, 4);
  }
}
