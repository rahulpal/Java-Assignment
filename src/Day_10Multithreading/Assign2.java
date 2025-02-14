// create a multi-threaded application by using  "implements Runnable" method.
//create 2 threads.they should display characters from A to J.


package Day_10Multithreading;

class printCharacter1 implements Runnable 
{

	@Override
	public void run() {
		for(int i = 65 ; i < 75 ; i++)
		{
			System.out.println(Thread.currentThread().getName() + " " + (char)i);
		}
		
	}
	
}
public class Assign2 {
	public static void main(String[] args)
	{
		printCharacter1 pc = new printCharacter1();
		
		Thread t1 = new Thread(pc);
		Thread t2 = new Thread(pc);
		
		t1.start();
		t2.start();
	}

}
