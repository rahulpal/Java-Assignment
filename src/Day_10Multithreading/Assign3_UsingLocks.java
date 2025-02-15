package Day_10Multithreading;
import java.util.concurrent.locks.*;
import java.util.concurrent.locks.ReentrantLock;

class Exec1 extends Thread
{
	private static final Lock lock = new ReentrantLock();
	@Override
	public void run()
	{
		lock.lock();
		try
		{
		for(int i = 0 ; i < 6 ; i++)
		{
		System.out.println(Thread.currentThread().getName() + " Exec " + i);
		}
		}
		finally
		{
			lock.unlock();
		}
	}
}
public class Assign3_UsingLocks {
	public static void main(String[] args)
	{
		Exec1 e = new Exec1();
		
		Thread t1 = new Thread(e);
		Thread t2 = new Thread(e);
		Thread t3 = new Thread(e);
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
