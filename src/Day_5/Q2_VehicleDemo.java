// create a class "Vehicle", define a method "public void start()" in it. 
// From this class derive a class FourWheeler. How will u override "start()" method of parent class ?

package Day_5;

class Vehicle
{
	public void start()
	{
		System.out.println("Vehicle start");
	}
}

class FourWheeler extends Vehicle
{
  public void start()
  {
	  System.out.println("FourWheeler start");
  }
}

public class Q2_VehicleDemo {
	
	public static void main(String[] args)
	{
		Vehicle v = new FourWheeler();
		v.start();
	}

}
