/* Revision_6)
write a program to display the method names inside the class which is passed as a command line argument.  */

package Day_9;

import java.lang.reflect.Method;

public class ReflectionAPI 
{
	public static void main(String[] args)
	{
		Class c = null;
		try {
			 c = Class.forName(args[0]);   // argument set is java.lang.String
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Method[] m = c.getDeclaredMethods();
		for(int i = 0 ; i < m.length ; i++)
		{
			System.out.println(m[i]);
		}
	
	}

}
