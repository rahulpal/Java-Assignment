// create 3 threads in such a way that while one thread is executing, 2 threads cannot interfere. 
//they should display output "Exec  0" to "Exec 5".

package Day_10Multithreading;

class Exec extends Thread
{
	public synchronized void run()
	
	{
		for(int i = 0 ; i < 6 ; i++)
		{
			System.out.println( Thread.currentThread().getName() + " Exec " + i);
		}
	}
}
public class Assign3 {
	public static void main(String[] args)
	{
		Exec e = new Exec();
		Thread t1 = new Thread(e);
		Thread t2 = new Thread(e);
		Thread t3 = new Thread(e);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
