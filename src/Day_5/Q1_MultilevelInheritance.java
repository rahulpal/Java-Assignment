//Create a multi-level inheritance , instantiate the child class and observe constructor invocation.
//Also show, if needed how will u invoke parent class constructor from child class ?

package Day_5;

class Base
{
	
	Base()
	{
		System.out.println("Non-parameterized Constructor Base");
	}
}

class Subclass extends Base
{
	Subclass()
	{
		System.out.println("Non-parameterized Constructor Subclass");
	}
	
	Subclass(String s)
	{
		System.out.println("Parameterized Constructor - Message received : " + s);
	}
}

class Subclass2 extends Subclass
{
	Subclass2()
	{
		super("Hello");   // parent class constructor invoked from child class using super keyword
		System.out.println("Non-parameterized Constructor Subclass2");
	}
}

public class Q1_MultilevelInheritance {
	
	public static void main(String[] args)
	{
		Subclass2 c = new Subclass2();
	}

}
