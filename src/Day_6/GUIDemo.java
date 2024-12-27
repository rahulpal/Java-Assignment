package Day_6;



interface MouseHandler
{
	void mouseClicked();
	void mousePressed();
	void mouseReleased();
}
interface WindowHandler
{
	void windowClosing();
	void windowClosed();
}

class WindowGUIApp implements MouseHandler,WindowHandler{

	@Override
	public void windowClosing() {
		// TODO Auto-generated method stub
		System.out.println("Window Closing");
		
	}

	@Override
	public void windowClosed() {
		// TODO Auto-generated method stub
		System.out.println("Window Closed");
		
	}

	@Override
	public void mouseClicked() {
		// TODO Auto-generated method stub
		System.out.println("Mouse Clicked");
		
	}

	@Override
	public void mousePressed() {
		// TODO Auto-generated method stub
		System.out.println("Mouse Pressed");
		
	}

	@Override
	public void mouseReleased() {
		// TODO Auto-generated method stub
		System.out.println("Mouse Released");
		
	}

}



public class GUIDemo {
	
	public static void main(String[] args)
	{
		WindowGUIApp wga = new WindowGUIApp();
		wga.mouseClicked();
		wga.mousePressed();
		wga.mouseReleased();
		wga.windowClosed();
		wga.windowClosing();
	}

}
