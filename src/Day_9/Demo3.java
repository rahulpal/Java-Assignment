/* Revision_3) 
create 4 classes A,B,C,D with member functions Afun(),Bfun(),Cfun() and Dfun() respectively.
now define "Demo" class with main function.
 Inside main function create array of Object class which will store instances of above mentioned classes.
  Traverse through this array and call "Cfun()" of class C only.
  */

package Day_9;

class A
{
	public void Afun()
	{
		System.out.println("inside A fun");
	}
}

class B
{
	public void Bfun()
	{
		System.out.println("inside B fun");
	}
}

class C
{
	public void Cfun()
	{
		System.out.println("inside C fun");
	}
}

class D
{
	public void Dfun()
	{
		System.out.println("inside D fun");
	}
}

public class Demo3 
{
	public static void main(String[] args)
	{
		Object[] ob = new Object[4];
		ob[0] = new A();
		ob[1] = new B();
		ob[2] = new C();
		ob[3] = new D();
		for(int i = 0 ; i < ob.length ; i++ )
		{
			if(ob[i] instanceof C)
			{
			((C) ob[i]).Cfun();
			}
		}
//		for(Object obj:ob)
//		{
//			if(obj instanceof C)
//			{
//			((C) obj).Cfun();
//			}
//		}
		
	}

}
