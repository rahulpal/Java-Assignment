// create a multi-threaded application by using  "extends Thread " method.
//create 2 threads. they should display characters from A to J.

package Day_10Multithreading;

class printCharacter extends Thread
{
	@Override
	public void run()
	{
		for(int i = 65 ; i < 75 ; i++)
		{
			System.out.println(Thread.currentThread().getName() + " " + (char)i);
			
		}
		
	}
}
public class Assign1 {
	
	public static void main(String[] args)
	{
		printCharacter pc1 = new printCharacter();
		pc1.start();
		printCharacter pc2 = new printCharacter();
		pc2.start();
	}

}
