/* Define 3 classes A , B and C
in all these classes create static and nonstatic variables as well as methods.
	Now Define a class "Demo" ,in which define "main" function. From this main function try to access all the members of A ,B  and C. */

/*  define static initializers in the above A,B and C classes and check the order of their execution. */



package Day_2;

class A {
	
	private static int anum;
	private int anum1;
	
	public static void setAnum(int anum) {
		A.anum = anum;
	}
	
	public static int getAnum() {
		return anum;
	}
	
	public void setAnum1(int anum1) {
		
		this.anum1 = anum1;
		
	}
	
	public int getAnum1() {
		return anum1;
	}
	
	static {
		System.out.println("Inside A static block");
	}
}

class B {
	
	private static int bnum;
	private int bnum1;
	
	public static void setBnum(int bnum) {
		B.bnum = bnum;
	}
	
	public static int getBnum() {
		return bnum;
	}
	
	public void setBnum1(int bnum1) {
		
		this.bnum1 = bnum1;
		
	}
	
	public int getBnum1() {
		return bnum1;
	}
	
	static {
		System.out.println("Inside B static block");
	}
}

class C {
	
	private static int cnum;
	private int cnum1;
	
	public static void setCnum(int cnum) {
		C.cnum = cnum;
	}
	
	public static  int getCnum() {
		return cnum;
	}
	
	public void setCnum1(int cnum1) {
		
		this.cnum1 = cnum1;
		
	}
	
	public int getCnum1() {
		return cnum1;
	}
	
	static {
		System.out.println("Inside C static block");
	}
}
 
public class Demo {
	
	public static void main(String [] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		
		A.setAnum(1);
		a.setAnum1(2);
		
		B.setBnum(3);
		b.setBnum1(4);
		
		C.setCnum(5);
		c.setCnum1(6);
		
		System.out.println(A.getAnum());
		System.out.println(B.getBnum());
		System.out.println(C.getCnum());
		System.out.println(a.getAnum1());
		System.out.println(b.getBnum1());
		System.out.println(c.getCnum1());
	}

}
