/* define your exception class by name "MyArithException"
(MyArithException.java)
define class "Calculator"   (Calculator.java)
In this class define a function,which will accept an int and return double of it.
e.g int caldouble(int)
This function will check an int which is passed to it
It will raise the  exception if 0 is passed or negative passed
in case of 0 caller of this method should get error message
"Zero not allowed" 
in case of negative caller of this method should get error message
"negative not allowed"
In case of positive value it should simply return the double value.
	[ this method shouldn't handle the exception]

Now define class "MyCalcApp" (MyCalcApp.java)
In this class you accept a number from user and pass that no. to
caldouble() method which is mentioned above. */

package Day_8.calculator;

import java.util.Scanner;
import Day_8.calculator.Calculator;
import Day_8.calculator.MyArithException;

public class MyCalcApp 
{
	public static void main(String[] args)
	{
		System.out.println("Enter the number to double it : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		Calculator c = new Calculator();
		int result;
		try
		{
			result = c.caldouble(num);
			System.out.println("Double of the entered number is : " +result);
		}
		catch(MyArithException mae)
		{
			System.out.println(mae.getMessage());
			
		}
	}

}
