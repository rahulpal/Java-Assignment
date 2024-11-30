//Define an interface “Vehicle” with “start()” function .
//Now derive  classes like “TwoWheeler”, “ThreeWheeler”,”FourWheeler” etc. from “Vehicle” and override “start()” function. 
//Define a class “VDemo” in which  write  main()  function. 
//In the main function create a reference to Vehicle  class referring to any of the sub class. 
//Using this reference, call “start" method.

package Day_4;

interface Vehicle 
{
	void start();
}

class TwoWheeler implements Vehicle
{
	public void start()
	{
		System.out.println("TwoWheeler start");
	}
}

class ThreeWheeler implements Vehicle
{
	public void start()
	{
		System.out.println("ThreeWheeler start");
	}
}

class FourWheeler implements Vehicle
{
	public void start()
	{
		System.out.println("FourWheeler start");
	}
}


public class Q10_VDemo {
	
	static void perform(Vehicle ref)
	{
		ref.start();
	}
	
	public static void main(String[] args)
	{
		
		perform(new TwoWheeler());
		perform(new ThreeWheeler());
		perform(new FourWheeler());
		
	/*	Vehicle arr[] = new Vehicle[3];
		arr[0] = new TwoWheeler();
		arr[1] = new ThreeWheeler();
		arr[2] = new FourWheeler();
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			arr[i].start();
		} */
	}

}
