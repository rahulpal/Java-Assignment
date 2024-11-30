//Show the example of hierarchical inheritance with constructor invocation.

package Day_4;

class Pet
{
	public Pet()
	{
		System.out.println("Pet constructor");
	}
	
	public void makeSound()
	{
		System.out.println("Pet Sound");
	}
}

class Dogie extends Pet
{
	public Dogie()
	{
		System.out.println("Dogie constructor");
	}
	
	public void makeSound()
	{
		System.out.println("Bark");
	}
}

class Catie extends Pet
{
	public Catie()
	{
		System.out.println("Catie constructor");
	}
	
	public void makeSound()
	{
		System.out.println("Meow");
	}
}

public class Q6_HierarchicalInheritance {
	
	public static void main(String[] args)
	{
		Pet d = new Dogie();
		Pet c = new Catie();
		d.makeSound();
		c.makeSound();
	}

}
