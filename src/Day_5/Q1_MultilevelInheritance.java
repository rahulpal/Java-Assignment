//Create a multi-level inheritance , instantiate the child class and observe constructor invocation.
//Also show, if needed how will u invoke parent class constructor from child class ?

package Day_5;

class A
{
	
	A()
	{
		System.out.println("Non-parameterized Constructor A");
	}
}

class B extends A
{
	B()
	{
		System.out.println("Non-parameterized Constructor B");
	}
	
	B(String s)
	{
		System.out.println("Parameterized Constructor - Message received : " + s);
	}
}

class C extends B
{
	C()
	{
		super("Hello");   // parent class constructor invoked from child class using super keyword
		System.out.println("Non-parameterized Constructor C");
	}
}

public class Q1_MultilevelInheritance {
	
	public static void main(String[] args)
	{
		C c = new C();
	}

}
