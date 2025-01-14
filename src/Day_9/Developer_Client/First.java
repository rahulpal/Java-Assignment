/*  Revision_7)
on the developer side create 4 classes [ First,Second,Third and Fourth] with only "toString()" method which should
 return the respective class name.

create necessary jar file and documentation


on the client side
	create a class "Demo" with main function and 
	static Object returnObject(String name)  method. 

this "returnObject()" method should 
	create the object of the given inside "name" parameter using Reflection API and return it.

from the main function invoke "returnObject()" by passing name of either "First" or "Second" or "Third" or "Fourth" only. Then main function should collect the object given by "returnObject()" method and display it. */

package Day_9.Developer_Client;

public class First 
{
	public String toString()
	{
		return "[ First ]";
	}

}
