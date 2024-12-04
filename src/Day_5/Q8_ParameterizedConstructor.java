// Define a class "base1" with only parameterized constructor.
// Derive a class "sub1" from "base1". This class should have following constructors
// 	a) Default
// 	b) one parameter
// 	c) two parameter
// Now try to instantiate "sub1" , using any of the above mentioned constructors.

package Day_5;

class base1
{
	int num;
	base1(int num)
	{
		this.num = num;
		System.out.println("In parameterized constructor of base1 with value of num : " + num);
	}
}

class sub1 extends base1
{
	sub1()
	{
		super(10);
		System.out.println("In non-parameterized constructor of sub1");
	}
	
	sub1(int k)
	{
		super(20);
		System.out.println("In one-parameterized constructor of sub1");
		
	}
	sub1(int a , int b)
	{
		super(30);
		System.out.println("In two-parameterized constructor of sub1");
		
	}
}

public class Q8_ParameterizedConstructor {
	
	public static void main(String[] args)
	{
		base1 ref = new sub1();
		base1 ref1 = new sub1(10);
		base1 ref2 = new sub1(10 , 20);
	}

}
