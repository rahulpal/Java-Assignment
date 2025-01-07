/* Interface Course
{
	void start();
	void stop();
}
now define 3 implementations: 
	DACDBDACourse,MSCit and Basic

inside "DACDBDACourse" class define one more method "public void orientation()"

define one more class "CourseDemo" with main function and "public static void show()" method.
from main function
	invoke "show()" method by passing object of any implementations and invoke "start()" and "stop()" methods. Also invoke "orientation()" method whenever object of "DACDBDACourse" is passed.
  */

package Day_7;

interface course2
{
	void start();
	void stop();
}

class DACDBDACourse2 implements course2
{

	public void orientation()
	{
		System.out.println("DACDBDACourse Orientation");
	}
	@Override
	public void start() 
	{
		System.out.println("DACDBDACourse started");
		
	}

	@Override
	public void stop() 
	{
		System.out.println("DACDBDACourse stoped");
		
	}
	
}

class MSCit2 implements course2
{

	@Override
	public void start() 
	{
		System.out.println("MSCit started");
		
	}

	@Override
	public void stop() 
	{
		System.out.println("MSCit stopped");
		
	}
	
}

class Basic2 implements course2
{

	@Override
	public void start() 
	{
		System.out.println("Basic started");
		
	}

	@Override
	public void stop() 
	{
		System.out.println("Basic stoped");
		
	}
	
}

public class CourseDemo2
{ 
	public static void show(course2 ref)
	{
		if(ref instanceof DACDBDACourse2)
		{
			((DACDBDACourse2) ref).orientation();
		}
		ref.start();
		ref.stop();
	}
	public static void main(String[] args)
	{
		show(new DACDBDACourse2());
		show(new MSCit2());
		show(new Basic2());
	}

}
