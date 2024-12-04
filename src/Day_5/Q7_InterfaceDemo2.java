// Define class "Parent1" with some data.
// Define interface "Parent2" with some methods.
// Derive a class "Child" from "Parent1" and "Parent2", instantiate it and call the members.

package Day_5;

class Parent1
{
	int num;
}

interface Parent2
{
	void disp();
}

class Childs extends Parent1 implements Parent2
{
	public void disp()
	{
		System.out.println("In disp");
	}
	
	void setnum(int num)
	{
		this.num = num;
	}
	
	int getnum()
	{
		return num;
	}
}

public class Q7_InterfaceDemo2 {
	
	public static void main(String[] args)
	{
		Childs c = new Childs();
		c.setnum(10);
		System.out.println(c.getnum());
		c.disp();
		
	}

}
