/* public class Course
{
	public void start()
	{
	}
	public void stop()
	{
	}
}
now define 3 child classes 
	DACDBDACourse,MSCit and Basic

inside "DACDBDACourse" class define one more method "public void orientation()"

define one more class "CourseDemo" with main function.
inside main function
	create an array of "Course" of 3 elements.
store all the child classes objects. Traverse the array and invoke "start()" and "stop()" of all the objects. Also invoke "orientation()" method wherever object of "DACDBDACourse" is present.
  */

package Day_7;

class Course1
{
	public void start() 
	{
		System.out.println("Course start");
	}
	public void  stop()
	{
		System.out.println("Course stop");
	}
}

class DACDBDACourse1 extends Course1
{
	
	public void orientation()
	{
		System.out.println("DACDBDACourse Orientation");
	}
	
	public void start() 
	{
		System.out.println("DACDBDACourse Course start");
	}
	public void  stop()
	{
		System.out.println("DACDBDACourse Course stop");
	}
}

class MSCit1 extends Course1
{
	public void start() 
	{
		System.out.println("MSCit Course start");
	}
	public void  stop()
	{
		System.out.println("MSCit Course stop");
	}
}

class Basic1 extends Course1
{
	public void start() 
	{
		System.out.println("Basic Course start");
	}
	public void  stop()
	{
		System.out.println("Basic Course stop");
	}
}

public class CourseDemo1
{
	public static void main(String[] args)
	{
		Course1[] course = new Course1[3];
		course[0] = new DACDBDACourse1();
		course[1] = new MSCit1();
		course[2] = new Basic1();
		
		for(Course1 c : course)
		{
			if(c instanceof DACDBDACourse1)
			{
				((DACDBDACourse1) c).orientation();
			}
			c.start();
			c.stop();
		}
	}

}
