//Define 2 classes “First” and “Second” with member variables , member functions and constructors of  your choice. 
//Now define a class “Two” in which define main function . 
//In main function create various instances of First and Second  and call their individual member functions.

package Day_4;

class First
{
    private int numA1;
    private int numA2;

    First()
    {


    }

    First(int numA1)
    {
        this.numA1 = numA1;
    }

    First(int numA1 , int numA2)
    {
        this.numA1 = numA1;
        this.numA2 = numA2;
    }

    public void setnumA1(int numA1)
    {
        this.numA1 = numA1;
    }

    public void setnumA2(int numA2)
    {
        this.numA2 = numA2;
    }

    public int getnumA1()
    {
        return numA1;
    }

    public int getnumA2()
    {
        return numA2;
    }
    
    @Override
    public String toString()
    {
    	return " Value of numA1 = " + numA1 + " , numA2 = " + numA2;
    }
    
}

class Second
{
    private int numB1;
    private int numB2;

    Second()
    {


    }

    Second(int numB1)
    {
        this.numB1 = numB1;
    }

    Second(int numB1 , int numB2)
    {
        this.numB1 = numB1;
        this.numB2 = numB2;
    }

    public void setnumB1(int numB1)
    {
        this.numB1 = numB1;
    }

    public void setnumB2(int numB2)
    {
        this.numB2 = numB2;
    }

    public int getnumB1()
    {
        return numB1;
    }

    public int getnumB2()
    {
        return numB2;
    }
    
    @Override
    public String toString()
    {
    	return " Value of numB1 = " + numB1 + " , numA2 = " + numB2;
    }
    
}

public class Two {

    public static void main(String[] args)
    {
        First f = new First(10 , 20);  // Initialized value using constructor 
        Second s = new Second(30 , 40); // Initialized value using constructor
        
        System.out.println(f);
        System.out.println(s);
        
        /*Initialize the instance values using constructor and then display it using the reference but then
        we need to override toString method of the class since when we print reference of an object then toString 
        method of that class is called - as shown above 
        
        or else 
        
        use getters and setters as below 
        */
        
        
       /* f.setnumA1(10);
        f.setnumA2(20);
        s.setnumB1(30);
        s.setnumB2(40);

       System.out.println( f.getnumA1());
       System.out.println( f.getnumA2());
       System.out.println(s.getnumB1());
       System.out.println(s.getnumB2());
       */

    }

    

}
