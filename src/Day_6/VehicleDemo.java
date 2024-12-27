package Day_6;

interface Vehicle { 
    
    // all are the abstract methods. 
    void changeGear(int a); 
    void speedUp(int a); 
    void applyBrakes(int a); 
} 


class FourWheeler implements Vehicle
{
	
	private int gear;
	private int speedup;
	public void changeGear(int a)
	{
		// how to change gear in FourWheeler
		this.gear = a;
		
	}
	public void speedUp(int a)
	{
		// how to speed up FourWheeler
		this.speedup+=a;
	}
	public void applyBrakes(int a)
	{
		// how to apply brakes of FourWheeler
		this.speedup-=a;
	}
	
	public String toString()
	{
		return "FourWheeler values are gear : " + gear + " speedup : " + speedup ;
	}
}


class TwoWheeler implements Vehicle
{
	private int gear;
	private int speedup;
	public void changeGear(int a)
	{
		// how to change gear in TwoWheeler
		this.gear=a;
	}
	public void speedUp(int a)
	{
		// how to speed up TwoWheeler
		this.speedup+=a;
	}
	public void applyBrakes(int a)
	{
		// how to apply brakes of TwoWheeler
		this.speedup-=a;
	}
	
	public String toString()
	{
		return "TwoWheeler values are gear : " + gear + " speedup : " + speedup ;
	}
}


public class VehicleDemo {
	
	static void perform(Vehicle ref)
	{
		ref.applyBrakes(30);
		ref.changeGear(50);
		ref.speedUp(100);
		System.out.println(ref.toString());
		
	}
	
	public static void main(String[] args)
	{
		perform(new FourWheeler());
		perform(new TwoWheeler());
	}

}
