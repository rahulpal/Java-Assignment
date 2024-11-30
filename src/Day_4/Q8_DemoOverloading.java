//Define a parent class with one function. 
//Define child class with the function having same name as of parent class function, but having different argument.
//Create an instance of child class and call the functions. Make sure u have followed the concept of “function overloading “ in inheritance.


package Day_4;

class A
{
	int num1A;
	int num2A;
	
	
	
	public void add(int num1A , int num2A)
	{
		System.out.println(num1A + num2A);
	}
}

class B extends A
{
	int num1B;
	int num2B;
	int num3B;
	
	public void add(int num1B , int num2B , int num3B)
	{
		System.out.println(num1B + num2B + num3B);
	}
}

public class Q8_DemoOverloading {
	
	public static void main(String[] args) 
	{
		A a = new A();
		a.add(1,2);
		B b = new B();
		b.add(1, 2, 3);
	}

}
