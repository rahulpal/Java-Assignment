/* Revision_2)
Define a class Sample with member variable “char ch” and a parameterized constructor.
 Create some instances(at least 2) of this class by passing any alphabet.  Now achieve following tasks:

a) when you print the reference it should be display the character which was passed during instantiation.
b) if two instances have same character or an alphabet, their "equals()" should return true and obviously "hashCode()" also should be same. */


// Below this code there is one more code which checks with String as here it is done with char
package Day_9;

class Sample
{
	private char ch;
	
	public Sample(char ch)
	{
		this.ch = ch;
	}
	public String toString()
	{
		return "[ ch = " + ch + "]";
	}
	public boolean equals(Object obj)
	{
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		Sample other = (Sample) obj;
		return this.ch == other.ch;
		
	}
	public int hashCode()
	{
		return ch;
		
	}
}
public class Demo2
{
	public static void main(String[] args)
	{
		Sample s1 = new Sample('a');
		Sample s2 = new Sample('a');
		Sample s3 = new Sample('b');
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		if(s1.equals(s2))
		{
			System.out.println("s1 and s2 have same character");
		}
		else
		{
			System.out.println("s1 and s2 have different characters");
		}
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
	}
}





























//import java.util.Objects;
//
//class Sample
//{
//	private String str;
//	public Sample(String str)
//	{
//		this.str = str;
//	}
//	public String toString()
//	{
//		return "[" + str + "]";
//	}
////	public boolean equals(Object obj)
////	{
////		
////		return this.ch == ((Sample)obj).ch;
////		
////	}
////	public int hashCode() 
////	{
////		return Objects.hash(ch);
////		
////	}
//	@Override
//	public int hashCode() {
//		return Objects.hash(str);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Sample other = (Sample) obj;
//		return str == other.str;
//	}
//
//	
//}
//
//public class Demo2
//{
//	public static void main(String[] args)
//	{
//		Sample s1 = new Sample("abc");
//		Sample s2 = new Sample("abc");
//		System.out.println(s1);
//		System.out.println(s2);
//		if(s1.equals(s2)) 
//		{
//			System.out.println("s1 and s2 both have same character");
//		}
//		else
//		{
//			System.out.println("s1 and s2 both have different character");
//		}
//		System.out.println(s1.hashCode());
//		System.out.println(s2.hashCode());
//	}
//
//}
