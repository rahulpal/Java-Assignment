// Go for Hierarchical inheritance, create instances of child class and observe constructor invocation.

package Day_5;

class Grandparent
{
	Grandparent()
	{
		System.out.println("Constructor of Grandparent");
	}
}

class Parent extends Grandparent
{
	Parent()
	{
		System.out.println("Constructor of Parent");
	}
}

class Child extends Grandparent
{
	Child()
	{
		System.out.println("Constructor of Child");
	}
}

public class Q3_HierarchicalInheritance {
	
	public static void main(String[] args)
	{
		Parent p = new Parent();
		Child c = new Child();
	}

}
