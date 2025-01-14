/* Revision_7)
on the developer side create 4 classes [ First,Second,Third and Fourth] with only "toString()" method which should
 return the respective class name.

create necessary jar file and documentation


on the client side
	create a class "Demo" with main function and 
	static Object returnObject(String name)  method. 

this "returnObject()" method should 
	create the object of the given inside "name" parameter using Reflection API and return it.

from the main function invoke "returnObject()" by passing name of either "First" or "Second" or "Third" or "Fourth" only. Then main function should collect the object given by "returnObject()" method and display it.  */

package Day_9.Developer_Client;

import java.lang.reflect.*;

public class Demo
{
	static Object returnObject(String name)
	{
		Class c = null;
		try 
		{
		c = Class.forName(name);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		Constructor ctor = null;
		try 
		{
		ctor = c.getDeclaredConstructor();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		Object ob = null;
		try 
		{
		 ob = ctor.newInstance();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return ob;
		
	}
	public static void main(String[] args)
	{
		Object obj1 = returnObject("Day_9.Developer_Client.First");
		System.out.println(obj1);
		Object obj2 = returnObject("Day_9.Developer_Client.Second");
		System.out.println(obj2);
		Object obj3 = returnObject("Day_9.Developer_Client.Third");
		System.out.println(obj3);
		Object obj4 = returnObject("Day_9.Developer_Client.Fourth");
		System.out.println(obj4);
		
	}
}

// Below same code is there where try and catch  is used only once and the main logic was taken from github 


















//import java.lang.reflect.*;
//import Day_9.Developer_Client.*;
//
//public class Demo 
//{
//	static Object returnObject(String name) {
//		Class c=null;
//		try {
//			c = Class.forName(name);
//			Constructor con = c.getDeclaredConstructor();
//			Object obj=con.newInstance();
//			return obj;
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			return null;
//		}
//	}
//	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException
//	{
//		Object obj1 =  returnObject("Day_9.Developer_Client.First");
//		System.out.println(obj1);
//		Object obj2 =  returnObject("Day_9.Developer_Client.Second");
//		System.out.println(obj2);
//		Object obj3 =  returnObject("Day_9.Developer_Client.Third");
//		System.out.println(obj3);
//		Object obj4 =  returnObject("Day_9.Developer_Client.Fourth");
//		System.out.println(obj4);
//		
//	}
//
//}
