/*  Define a class "DemoOb". 
create an instance of it.
now create a reference and assign the reference created in the above statement.
	Discuss what happens?
Now since u have 2 references, take one of the reference and assign a new instance of the class.
	Discuss what happens?
(For ur discussion, write necessary comments in the program) */

package Day_2;

class DemoOb{
	
}

public class Q4_DemoOb {
	
	public static void main(String [] args) {
		DemoOb d = new DemoOb(); // object will be created in the heap and reference d will be referring to that object.
		DemoOb d1 = d; // the newly created reference d1 will point to the object that d is referring to.
		d = new DemoOb(); // now d will be referring to new object created in heap due to - new DemoOb();
		
	}

}
