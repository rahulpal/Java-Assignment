// Define a parent and a child class . Now explain function overriding with Example.

package Day_4;

class Parent
{
	public void disp()
	{
		System.out.println("Base");
	}
	
	public Object show()   // Co-variant return type 
	{
		return "BaseShow";
	}
}

class Child extends Parent
{
	public void disp()
	{
		System.out.println("Subclass");
	}
	
	public String show()  // Co-variant return type 
	{
		return "Subclass";
	}
}

public class Q7_DemoOverriding {
	
	public static void main(String[] args)
	{
		Parent b = new Child();
		b.disp();
		System.out.println(b.show());
		
	}

}
