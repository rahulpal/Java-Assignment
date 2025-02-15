
//create 2 threads. Write a program which displays number 1 to 10 using class lock. 
//[hint:- use "implements Runnable" and synchronized block]

package Day_10Multithreading;

class display implements Runnable
{

	@Override
	public  void run() {
		synchronized(this)
		{
			for(int i = 1 ; i <= 10 ; i++)
		    {
			   System.out.println(i);
			   try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    }
		}
		
	}
	
}
public class Assign4  {
	public static void main(String[] args)
	{
		display d = new display();
		Thread t1 = new Thread(d);
		
		Thread t2 = new Thread(d);
		
		t1.start();
		t2.start();
	}

}
