//Create a class with static and non-static member variables. 
//Define static and non-static member functions. 
//Create instance of this class and call both static and non-static member functions.

package Day_4;

class Base
{
	private int num1;
	private static int num2;
	
	public int getNum1()
	{
		return num1;
	}
	
	public void setNum1(int num1) 
	{
		this.num1 = num1;
	}
	public static int getNum2() 
	{
		return num2;
	}
	public static void setNum2(int num2)
	{
		Base.num2 = num2;
	}
	
	
}

public class Q2_Main {
	
	public static void main(String[] args)
	{
		Base.setNum2(10);
		System.out.println(Base.getNum2());
		Base b = new Base();
		b.setNum1(20);
		System.out.println(b.getNum1());
		
	}

}
