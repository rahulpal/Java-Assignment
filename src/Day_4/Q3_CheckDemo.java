//Define a class “Check” in which declare member variables using  different accessibility modifiers i.e.  <default>, private ,public and protected.   
//Define a function “disp”  which should be public.  
//Define a class “CheckDemo” in which you will write “main()” function. 
//Create an instance of  the class “Check” and  show how many  variables can be accessed directly and how many indirectly.

package Day_4;

class Check 
{
	int a;
	private int b = 5; // every object will have its own copy of private int b but if it was static then this int b would have been shared among all the objects.
	public int c ;
	protected int d;
	
	public void disp()
	{
		System.out.println(b);
	}
}

public class Q3_CheckDemo {
	
	public static void main(String[] args)
	{
		Check chk = new Check();
		chk.disp();  // Accessed indirectly using method disp since int b is private 
		System.out.println( chk.a = 10); // Accessed directly just by using reference since int a is default 
		System.out.println( chk.c = 20); // Accessed directly just by using reference since int c is public
		System.out.println( chk.d = 30); // Accessed directly just by using reference since int d is protected
		
	}

}
