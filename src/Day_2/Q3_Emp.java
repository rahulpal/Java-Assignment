/* Define a class "Emp" with private static member "int cnt".
How will u make sure that outsiders can read the value of cnt ? */

package Day_2;

class Emp{
	
	private static int cnt;
	
	public static void setCnt(int cnt) {
		
	Emp.cnt = cnt;
	}
	
	public static int getCnt() {
		return cnt;
	}
	
}

public class Q3_Emp {

	public static void main(String[] args) {
		
		Emp.setCnt(10);
		System.out.println(Emp.getCnt());
		
		
		
	}
}
  