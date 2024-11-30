// Show the example of multi-level inheritance with constructor invocation.

package Day_4;

class Animals
{
	public Animals()
	{
		System.out.println("Animals(Parent) constructor");
	}
	
	public void makeSound()
	{
		System.out.println("Animals Sound");
	}
	
}

class Mammal extends Animals
{
	public Mammal()
	{
		System.out.println("Mammal(Child of Animals) constructor");
	}
	
	public void makeSound()
	{
		System.out.println("Mammal Sound");
	}
}

class Dogs extends Mammal
{
	public Dogs()
	{
		System.out.println("Dogs(Child of Mammal) constructor");
	}
	
	public void makeSound()
	{
		System.out.println("Dogs Sound");
	}
}

public class Q5_MultilevelInheritance {
	
	public static void main(String[] args) 
	{
		Animals a = new Dogs();
		a.makeSound();
		
	}

}
