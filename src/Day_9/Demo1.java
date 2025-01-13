/* Revision_1) 
Define a class “MyClass”. 
Define a class “Everything” and define a member function with variable no. of argument inside it. 
Define  a class Demo1  and define main function in it.
 From main function , call the function of class Everything and make sure you can pass any arguments ,
  it will take and display.
  It should even take instance of “MyClass” and display.
  */
package Day_9;

class MyClass
{
//	public String toString()
//	{
//		return "[" + "]";
//		
//	}
}
class Everthing
{
	
	public void disp(Object ... a)
	{
	
	for(int i = 0 ; i < a.length ; i++)
	{
		System.out.println(a[i]);
	}

}
}
public class Demo1 
{
	public static void main(String[] args)
	{
		Everthing e = new Everthing();
		MyClass  c = new MyClass();
		e.disp(1,2,3,"abc",2.5f,c);
	}
}

