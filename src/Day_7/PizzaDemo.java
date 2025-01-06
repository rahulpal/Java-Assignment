/* public interface PizzaIngredientFactory
{
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Pepperoni createPepperoni();
	public Clams createClams();
}
define 2 implementations 
	USPizzaIngredientFactory and IndianPizzaIngredientFactory

create an array of "PizzaIngredientFactory" , store all the implemenations object inside it, traverse the array and invoke all the methods.
  */

package Day_7;

 interface PizzaIngredientFactory
{
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Pepperoni createPepperoni();
	public Clams createClams();
}
 
 class Dough
 {
	 Dough(String mess)
	 {
		System.out.println("Preparing " + mess + " dough" ); 
	 }
 }
 
 class Sauce
 {
	 Sauce(String mess)
	 {
		System.out.println("Preparing " + mess + " sauce"); 
	 } 
 }
 class Cheese 
 {
	 Cheese(String mess)
	 {
		System.out.println("Preparing " + mess + " cheese"); 
	 } 
 }
 class Pepperoni
 {
	 Pepperoni(String mess)
	 {
		System.out.println("Preparing " + mess + " pepperoni"); 
	 }
 }
 class Clams
 {
	 Clams(String mess)
	 {
		System.out.println("Preparing " + mess + " clams"); 
	 }
 }
 
 class USPizzaIngredientFactory implements PizzaIngredientFactory
 {

	@Override
	public Dough createDough() {
		
		return new Dough("US");
	  
	}

	@Override
	public Sauce createSauce() {
		
		return new Sauce("US");
	}

	@Override
	public Cheese createCheese() {
	
		return new Cheese("US");
	}

	@Override
	public Pepperoni createPepperoni() {
		
		return new Pepperoni("US");
	}

	@Override
	public Clams createClams() {
	
		return new Clams("US");
	}
	 
 }
 
 class IndianPizzaIngredientFactory implements PizzaIngredientFactory
 {

	@Override
	public Dough createDough() {
		return new Dough("Indian");
	}

	@Override
	public Sauce createSauce() {
		return new Sauce("Indian");
	}

	@Override
	public Cheese createCheese() {
	return new Cheese("Indian");
	}

	@Override
	public Pepperoni createPepperoni() {
	return new Pepperoni("Indian");
	}

	@Override
	public Clams createClams() {
    return new Clams("Indian");
	}
	 
 }

public class PizzaDemo 
{
	public static void main(String[] args)
	{
		PizzaIngredientFactory[] p = new PizzaIngredientFactory[2];
		p[0] = new USPizzaIngredientFactory();
		p[1] = new IndianPizzaIngredientFactory();
		
		for(PizzaIngredientFactory a : p)
		{
			a.createDough();
			a.createSauce();
			a.createCheese();
			a.createPepperoni();
			a.createClams();
			
		}
	}

}
