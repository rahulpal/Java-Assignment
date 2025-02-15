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

//import Day_8.client.*;

public class MyMath
{
   public void disp(int num) throws NumberNotDivisibleBySevenException
   {
	   if(num%7 == 0)
	   {
		   System.out.println( num + " is divisible by 7");
	   }
	   else
	   {
		   throw new NumberNotDivisibleBySevenException("Number is not divisible by 7");
	   }
   }
}
