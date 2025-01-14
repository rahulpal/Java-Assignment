/* Revision_4) 
create a parent class "Artist" with a member function "void perform()".
now derive following child classes from "Artist"
	Actor,Singer and Musician and override "perform" in these classes to write the specific task.
inside "Actor" class define one more method
	void changeGateUp()
	{
		S.o.p("as per the role demands");
	}

now create a Demo class with main function.
inside main function create array of "Artist" with size 3.
store instances of the above child classes in it.
Now traverse through the array and invoke "perform" of each child class.
 In addition to this wherever "Actor" object is there inside the array , also perform "changeGateUp()" method.  */

package Day_9;

class Artist
{
	public void perform()
	{
		System.out.println("Artist perform");
	}
}

class Actor extends Artist
{
	public void perform()
	{
		System.out.println("Actor perform");
	}
	
	public void changeGetup()
	{
		System.out.println("As per the role demands");
	}
}

class Singer extends Artist
{
	public void perform()
	{
		System.out.println("Singer perform");
	}
}

class Musician extends Artist
{
	public void perform()
	{
		System.out.println("Musician perform");
	}
}

public class Demo4 
{
	public static void main(String[] args)
	{
		Artist[] artist = new Artist[3];
		artist[0] = new Actor();
		artist[1] = new Singer();
		artist[2] = new Musician();
		for(int i = 0 ; i < artist.length ; i++)
		{
			if(artist[i] instanceof Actor)
			{
				((Actor)artist[i]).changeGetup();
			}
			artist[i].perform();
		}
		
	}

}
