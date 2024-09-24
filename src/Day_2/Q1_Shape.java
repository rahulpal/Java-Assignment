/* create a class "Shape" with 2 attributes, "width" and "height". Make sure one can not access these attributes directly.
provide accessor methods on these attributes and allow them to call from outside of your class. */

package Day_2;

 class Shape {
	
	private int width;
	private int height;
	
	public void setWidth(int width) {
		
		this.width = width;		
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getHeight() {
		return height;
	}

}

 public class Q1_Shape{
	 public static void main(String [] args) {
		 
		 Shape shape = new Shape();
		 shape.setWidth(10);
		 shape.setHeight(10);
		 
		 System.out.println(shape.getWidth());
		 System.out.println(shape.getHeight());
	 }
 }

