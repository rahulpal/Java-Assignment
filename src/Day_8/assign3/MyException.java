/* 3) define "MyException" as a checked exception.

define a class "Demo" with 
	public void show1(), public void show2() , public void show3() and main functions.

inside "show3()" accept a number and if it is greater than 10 raise "MyException" else display the number.
	[ this method shouldn't handle the exception]

main() function should call "show1()" , 
show1() function should call "show2()",
show2() function should call "show3()"

show2() should not handle the exception but show1() should handle.  */


package Day_8.assign3;

public class MyException extends Exception
{
	public MyException(String mess)
	{
		super(mess);
	}

}
