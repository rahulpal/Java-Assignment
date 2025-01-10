/* 2) on the developer side create an exception:
	NumberNotDivisibleBySevenException
	as a checked exception

create necessary jar and documentation.

on client side
	public class MyMath class with 
		public void disp(int num)
this disp() method will check if the number passed is not divisible by 7 , it will raise "NumberNotDivisibleBySevenException" or else it will simply display the number passed.
	[ this method shouldn't handle the exception]

	public class Demo
		main function 
		invoke "disp()" of "MyMath" class.  */

package Day_8.client;

import java.util.Scanner;

public class Demo 
{
	public static void main(String[] args)
	{
		System.out.println("Enter the number for checking divisibility with 7 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		MyMath mm = new MyMath();
		try
		{
		mm.disp(num);
		}
		catch(NumberNotDivisibleBySevenException ae)
		{
			//System.out.println(ae.getMessage());
			ae.printStackTrace();
		}
	}

}
