/* /* Revision_5) 
	it's a Developer- Client example
on a Developer side:

create a checked exception "VotingNotAllowedException".

define a class "Person" with a instance member "private String name" and "private int age"
define parameterized constructor and toString() method also.
In the parameterized constructor check the age passed while instantiating the class. 
if the age is less than 18 , constructor should raise "VotingNotAllowedException"
	[ it should not handle the exception]

	create jar file and documentation 


on Client side:

Define a class "Demo" with main function.
From main function create an object of "Person" and display that object.  */
 

package Day_9.Exception;

public class VotingNotAllowedException extends Exception
{
	public VotingNotAllowedException(String mess)
	{
		super(mess);
	}

}
