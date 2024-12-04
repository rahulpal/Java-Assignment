// Create a class "Top1" with "disp1()" method.
//From this class Derive "Bottom1", "Bottom2" and "Bottom3" classes ,override the "disp1()".
//Now show how will u achieve dynamic polymorphism.

package Day_5;

class Top1
{
	void disp1()
	{
		System.out.println("In Top1");
	}
}

class Bottom1 extends Top1
{
	void disp1()
	{
	System.out.println("In Bottom1");
	}
}

class Bottom2 extends Top1
{
	void disp1()
	{
	System.out.println("In Bottom2");
	}
}

class Bottom3 extends Top1
{
	void disp1()
	{
	System.out.println("In Bottom3");
	}
}

public class Q5_DynamicPolymorphism {
	static void perform(Top1 ref)  // using perform() method 
	{
		ref.disp1();
	}
	
	public static void main(String[] args)
	{
		/*
		 Top1 T1 = new Bottom1();   // using basic approach 
		Top1 T2 = new Bottom2();
		Top1 T3 = new Bottom3();
		T1.disp1();
		T2.disp1();
		T3.disp1();
		*/
		perform(new Bottom1());
		perform(new Bottom2());
		perform(new Bottom3());
	}

}
