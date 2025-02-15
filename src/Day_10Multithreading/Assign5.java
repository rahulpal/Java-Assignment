
//create 2 threads, one thread will display 1 to 50,second thread will display 50 to 1
//both the threads should start simultaneously.(use implements method)


package Day_10Multithreading;

class displayNumber implements Runnable
{

	@Override
	public void run() {
		if(Thread.currentThread().getName().equals("first"))
		{
			
			for(int i = 1 ; i <= 50 ; i++)
			{
				
				System.out.println( Thread.currentThread().getName() + " : "+ i);
			}
			
		}
		else
		{
			for(int i = 50 ; i > 0; i--)
			{
				System.out.println(Thread.currentThread().getName() + " : "+ i);
			}
		}
	}
	
}
public class Assign5 {
	public static void main(String[] args)
	{
		displayNumber dn = new displayNumber();
		
		Thread t1 = new Thread(dn , "first");
		Thread t2 = new Thread(dn , "second");
		
		
		t1.start();
		t2.start();
	}

}
