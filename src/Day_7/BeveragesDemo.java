/* abstract class Beverages {

	// Defined
	public void addMilk() {

	}

	// abstract
	abstract void addIngredients();
}

class Coffee extends Beverages
{
	void addIngredients()
	{
		// ingredients for Coffee
	}
	// addMilk inherited
}
class Tea extends Beverages
{
	void addIngredients()
	{
		// ingredients for Tea
	}
	// addMilk inherited
}
class FruitJuice extends Beverages
{
	void addIngredients()
	{
		// ingredients for FruitJuice
	}
	// addMilk inherited
}

create Array of Beverages class and store all the child classes objects.
now traverse the array and invoke all the functions.  */

package Day_7;

abstract class Beverages {

	
	public void addMilk() 
	{
      System.out.println("Adding Milk");
	}

    
	abstract void addIngredients();
}

class Coffee extends Beverages
{
	void addIngredients()
	{
		System.out.println("Adding Ingredient for Coffee");
	}
	// addMilk inherited
}
class Tea extends Beverages
{
	void addIngredients()
	{
		System.out.println("Adding Ingredient for Tea");
	}
	// addMilk inherited
}
class FruitJuice extends Beverages
{
	void addIngredients()
	{
		System.out.println("Adding Ingredient for FruitJuice");
	}
	// addMilk inherited
}

public class BeveragesDemo 
{
	public static void main(String[] args)
	{
		Beverages arr[] = new Beverages[3];
		arr[0] =  new Coffee();
		arr[1] =  new Tea();
		arr[2] =  new FruitJuice();
		
		for(int i = 0 ;  i < arr.length ; i++)
		{
			arr[i].addMilk();
			arr[i].addIngredients();
		}
		System.out.println("***************************************");
		for(Beverages b:arr)
		{
			b.addMilk();
			b.addIngredients();
		}
	}

}
