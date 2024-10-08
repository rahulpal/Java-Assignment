/*  Define a class "MyClass" and make sure clients can instantiate it , 
a) without any argument
b) with one int argument
c) with two int arguments  */

package Day_2;

class MyClass {
	
	private int num;
	private int num2;
	
	public MyClass() {
		
	}
	
	public MyClass(int num) {
		this.num = num;
	}
	
	public MyClass(int num , int num2) {
		this.num = num;
		this.num2 = num2;
	}
	
	public String toString() {
		return "MyClass [ num = " +num + " , num2 = " + num2 + "]" ;
		
	}
}

public class Q2_MyClass {
	
	public static void main(String[] args) {
		
		MyClass m = new MyClass();
		MyClass m1 = new MyClass(10);
		MyClass m2 = new MyClass(10,20);
		
		System.out.println(m);
		System.out.println(m1);
		System.out.println(m2);
	}

}
