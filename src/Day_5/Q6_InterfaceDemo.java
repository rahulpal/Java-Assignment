// Define interface "A" with "disp1()" method.
// Derive from "A", interface "B" with "disp2" method.
// Derive class "C" , from "B".
// Instantiate class "C" and call its members as well as derived from parent interfaces.

package Day_5;

interface A
{
	void disp1();
}

interface B extends A 
{
	void disp2();
}

class C implements B
{
	public void disp1()
	{
		System.out.println("In disp1");
	}
	
	public void disp2()
	{
		System.out.println("In disp2");
	}
	
	public void disp3()
	{
		System.out.println("In disp3");
	}
}
public class Q6_InterfaceDemo {
	public static void main(String[] args)
	{
		C c = new C();
		c.disp1();
		c.disp2();
		c.disp3();
	}

}
