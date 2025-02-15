
//create 2 threads. Write a program which displays number 1 to 10 using class lock. 
//[hint:- use "implements Runnable" and synchronized block]

package Day_10Multithreading;

public class Assign4_Usinglambda {
	public static void main(String[] args)
	{
		Thread t1 = new Thread(() -> 
		{
		 synchronized(Assign4.class) {
			  for(int i = 1 ; i <= 10 ; i++)
		  {
		  
			 System.out.println(i); 
		  }
		  
		}
		});
		
		Thread t2 = new Thread(() -> 
		{
		  synchronized(Assign4.class){
			  for(int i = 1 ; i <= 10 ; i++)
		  {
		  
			 System.out.println(i); 
		  }
		  
		}
		});
		
		t1.start();
		t2.start();
	}

}
