// create abstract class Shape. declare "draw()" function as abstract. 
// From this class define "Triangle","Polygon" and "Circle" .
// create an array of Shape having 3 elements.
// store child objects into this array . and call
// their draw function.

package Day_5;

abstract class Shape
{
	public abstract void draw();
	
}

class Triangle extends Shape
{

	@Override
	public void draw() {
		
		System.out.println("Draw Triangle");
		
	}
	
}

class Polygon extends Shape
{

	@Override
	public void draw() {
		
		System.out.println("Draw Polygon"); 
		
	}
	
}

class Circle extends Shape
{

	@Override
	public void draw() {
		
		System.out.println("Draw Circle");
		
	}
	
}

public class Q5_AbstractShape {
	
	public static void main(String[] args)
	{
		Shape arr[] = new Shape[3];
		arr[0] = new Triangle();
		arr[1] = new Polygon();
		arr[2] = new Circle();
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			arr[i].draw();
		}
	}

}
