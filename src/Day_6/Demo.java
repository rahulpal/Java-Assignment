package Day_6;

 interface PersistenceMechanism
{
	void writeData(String ref);
	String readData();
}




class FileSystem implements PersistenceMechanism
{

String data;

	public void writeData(String ref)
	{
		this.data = ref;
	}
	public String readData()
	{
	     return data;
	}
}


class DatabaseSystem implements PersistenceMechanism
{
	String data;
	public void writeData(String ref)
	{
		this.data = ref;
	}
	public String readData()
	{
		return data;
	}
}

class BigdataSystem implements PersistenceMechanism
{
	String data;
	public void writeData(String ref)
	{
	     this.data = ref;
	}
	public String readData()
	{
		return data;
	}
}



public class Demo {
	
	static void writeandread(PersistenceMechanism ref)
	{
		if(ref instanceof BigdataSystem)
		{
			ref.writeData("Hello Mate");
			System.out.println(ref.readData());
		}
	}
	
	public static void main(String[] args)
	{
		
		PersistenceMechanism[] arr = new PersistenceMechanism[3];
		arr[0] = new FileSystem();
		arr[1] = new DatabaseSystem();
		arr[2] = new BigdataSystem();
		
		
		for(int i = 0 ; i <arr.length ; i++)
		{
			writeandread(arr[i]);
		}
		
		/*
		 *    
		 *    for (PersistenceMechanism persistence : arr) 
		 *   {
                writeandread(persistence);
             }
		 */
		
	}

}
