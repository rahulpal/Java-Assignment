//Show the example of single level inheritance with constructor invocation.

package Day_4;

class Animal
{
	public Animal()
	{
		System.out.println("Animal(Parent) constructor");
	}
	public void makeSound()
	{
		System.out.println("Animal Sound");
	}
}

 class Dog extends Animal
 {
	 public Dog()
		{
		    // Implicit call to super(); invokes Animal's constructor
			System.out.println("Dog(Child) constructor");
		}
		public void makeSound()
		{
			System.out.println("Bark");
		}
 }
public class Q4_SingleInheritance {
	
	public static void main(String[] args)
	{
		Animal a = new Dog();
		a.makeSound();
	}

}
