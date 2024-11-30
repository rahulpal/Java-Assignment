//Define a class “Shape” with “draw()” function .
//Now derive  classes like “Circle”, “Polygon”,”Rectangle” etc. from “Shape” and override “draw()” function.
//Define a class “ShapeDemo” in which  write  main()  function. 
//In the main function create a reference to Shape class referring to any of the sub class.
//Using this reference, call “draw()” and check the result.

package Day_4;

class Shape
{
	public void draw()
	{
		System.out.println("Shape");
	}
}

class Circle extends Shape
{
	public void draw()
	{
		System.out.println("Circle");
	}
}


class Polygon extends Shape
{
	public void draw()
	{
		System.out.println("Polygon");
	}
}


class Rectangle extends Shape
{
	public void draw()
	{
		System.out.println("Rectangle");
	}
}

public class Q9_ShapeDemo {
	
	public static void main(String[] args)
	{
		Shape c = new Circle();
		Shape p = new Polygon();
		Shape r = new Rectangle();
		
		c.draw();
		p.draw();
		r.draw();
	}

}
