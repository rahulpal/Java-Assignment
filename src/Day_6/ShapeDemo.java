/*on developer side:
create interface "Shape" with "void draw();" method.

now define child classes 
	Triangle,Rect and Circle

create necessary jar file and documentation.


on Client side:

define "ShapeDemo" class with main function

create an array of "Shape" with 3 elements. store objects of Triangle,Rect and Circle in this array. now traverse the array and invoke "draw()" of each child.
*/


package Day_6;

interface Shape
{
	void draw();
}

class Triangle implements Shape
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Triangle");
		
	}
	
}

class Rectangle implements Shape
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle");
	}
	
}

class Circle implements Shape
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Circle");
	}
	
}

public class ShapeDemo {
	
	public static void main(String[] args) {
		
	Shape[] shapes = new Shape[3];
	shapes[0] = new Triangle();
	shapes[1] = new Rectangle();
	shapes[2] = new Circle();
	
	for(int i = 0 ; i < shapes.length ; i++)
	{
		shapes[i].draw();
	}
	
	/*
	  for( Shape s:shapes)
	{
		s.draw();
	}
	*/

}
}
