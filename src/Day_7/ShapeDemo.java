/* create abstract class "Shape" with
	a contract "draw()" and concrete behaviour "show()"

create 3 child classes
	Triangle, Rectangle and Circle

define a class "ShapeDemo" with main
inside main create an array of "Shape" of 3 elements. Store all the child class objects inside the array, traverse it and invoke "draw()" and "show()" methods polymorphically.
 */


package Day_7;

abstract class Shape
{
	void show()
	{
		System.out.println("Show Shape");
	}
	abstract void draw();
}

class Triangle extends Shape
{

	@Override
	void draw()
	{
		System.out.println("Draw Triangle");
		
	}
	
}

class Rectangle extends Shape
{
	@Override
	void draw()
	{
		System.out.println("Draw Rectangle");
		
	}
}

class Circle extends Shape
{
	@Override
	void draw()
	{
		System.out.println("Draw Circle");
		
	}
}

public class ShapeDemo 
{
	public static void main(String[] args)
	{
     Shape arr[] = new Shape[3];
     arr[0] = new Triangle();
     arr[1] = new Rectangle();
     arr[2] = new Circle();
     
     for(int i = 0 ; i <arr.length ; i++)
     {
    	 arr[i].draw();
    	 arr[i].show();
     }
     System.out.println("********************************");
     for(Shape s: arr)
     {
    	 s.draw();
    	 s.show();
     }
}
}
