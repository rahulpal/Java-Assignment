/* public abstract class Course
{
	public void start()
	{
		// start process
	}
	public abstract double getFee();
	public abstract void evaluate();
}

define child classes of above abstract class
	DACDBDACourse extends Course
	MSCitCourse extends Course

show late binding with the help of "perform()" method. */

package Day_7;

 abstract class Course
{
	public void start()
	{
		System.out.println("Starting the course");
	}
	public abstract double getFee();
	public abstract void evaluate();
}
 
 class DACDBDACourse extends Course 
 {
      double dac = 98000;
	@Override
	public double getFee()
	{
	
		return dac;
	}

	@Override
	public void evaluate()
	{
		System.out.println("Evaluating DACDBDACourse");
		
	}
	 
 }
 
 class MSCitCourse extends Course 
 {
      double mscit = 15000;
	@Override
	public double getFee()
	{
	
		return mscit;
	}

	@Override
	public void evaluate()
	{
		System.out.println("Evaluating MSCitCourse");
		
	}
	 
 }

public class CourseDemo 
{
	
	static void perform(Course ref)
	{
		ref.start();
		ref.evaluate();
		System.out.println(ref.getFee());
		System.out.println("****************************");
	}
	public static void main(String[] args)
	{
		perform(new DACDBDACourse());
		perform(new MSCitCourse());
		
	}

}
