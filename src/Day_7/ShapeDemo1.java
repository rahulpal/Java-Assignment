/* on developer side:

create interface "Shape" with "void draw();" method.

now define child classes 
	Triangle,Rect and Circle



on Client side:

define "ShapeDemo" class with main and perform functions

define perform function in such a way that given any shape it can invoke "draw()" of it.


  */

package Day_7;

interface Shape1
{
	void draw();
}

class Triangle1 implements Shape1
{

	@Override
	public void draw()
	{
		System.out.println("Draw Triangle");
		
	}
	
}

class Rectangle1 implements Shape1
{

	@Override
	public void draw()
	{
		System.out.println("Draw Rectangle");
		
	}
	
}

class Circle1 implements Shape1
{

	@Override
	public void draw()
	{
		System.out.println("Draw Circle");
		
	}
	
}

public class ShapeDemo1 
{
	static void perform(Shape1 ref)
	{
		ref.draw();
	}
	public static void main(String[] args)
	{
		perform(new Triangle1());
		perform(new Rectangle1());
		perform(new Circle1());
	}

}
