/* public class UIComponent
{
}
public class Button extends UIComponent
{
}
public class TextField extends UIComponent
{
}
public class CheckBox extends UIComponent
{
}
public abstract class UIComponentCreator
{
	public void show(String type)
	{
		UIComponent comp=createUIComponent(type);
		add(comp);
	}
	public void add(UIComponent component)
	{
		System.out.prinlnt("Added the component\t"+component);
	}
	public abstract UIComponent createUIComponent(String type);
}

create 3 child classes of "UIComponentCreator"
	WindowsUIComponentCreator, LinuxUIComponentCreator and MacUIComponentCreator
 in all these classes "createUIComponent()" method must be defined in such a way that whatever type is passed as per this it must return a specific UIComponent. e.g. if "button" is passed , it should return "Button" class object   or if "textfield" is passed , it should return "TextField" class object.

create a class UIComponentCreatorDemo with main function
inside main function
	create objects of WindowsUIComponentCreator, LinuxUIComponentCreator and MacUIComponentCreator classes and invoke "createUIComponent()" ,"add()" and "show()" methods. */


package Day_7;


 class UIComponent
{
	  public String toString() {
	        return "UIComponent";
	    }
}
 class Button extends UIComponent
{
	  public String toString() {
	        return "Button";
	    }
}
 class TextField extends UIComponent
{
	  public String toString() {
	        return "TextFiled";
	    }
	 
}
 class CheckBox extends UIComponent
{
	  public String toString() {
	        return "CheckBox";
	    }
}
 abstract class UIComponentCreator
{
	public void show(String type)
	{
		UIComponent comp=createUIComponent(type);
		add(comp);
	}
	public void add(UIComponent component)
	{
		System.out.println("Added the component\t"+component);
	}
	public abstract UIComponent createUIComponent(String type);
	
}
 
 class WindowsUIComponentCreator extends UIComponentCreator 
 {

	@Override
	public UIComponent createUIComponent(String type)
	{
		if(type.equalsIgnoreCase("button"))
		{
			UIComponent button = new Button();
			return button;
		}
		if(type.equalsIgnoreCase("textfield"))
		{
			UIComponent textfield = new TextField();
			return textfield;
		}
		if(type.equalsIgnoreCase("checkbox"))
		{
			UIComponent checkbox = new CheckBox();
			return checkbox;
		}
		return null;
	}
	 
 }
 
 class LinuxUIComponentCreator extends UIComponentCreator 
 {

	@Override
	public UIComponent createUIComponent(String type)
	{
		if(type.equalsIgnoreCase("button"))
		{
			UIComponent button = new Button();
			return button;
		}
		if(type.equalsIgnoreCase("textfield"))
		{
			UIComponent textfield = new TextField();
			return textfield;
		}
		if(type.equals("checkbox"))
		{
			UIComponent checkbox = new CheckBox();
			return checkbox;
		}
		return null;
	}
	 
 }
 
 class MacUIComponentCreator extends UIComponentCreator 
 {

	@Override
	public UIComponent createUIComponent(String type)
	{
		if(type.equalsIgnoreCase("button"))
		{
			UIComponent button = new Button();
			return button;
		}
		if(type.equalsIgnoreCase("textfield"))
		{
			UIComponent textfield = new TextField();
			return textfield;
		}
		if(type.equalsIgnoreCase("checkbox"))
		{
			UIComponent checkbox = new CheckBox();
			return checkbox;
		}
		return null;
	}
	 
 }


public class UIComponentCreatorDemo 
{
	public static void main(String[] args)
	{
		WindowsUIComponentCreator windows = new WindowsUIComponentCreator();
		LinuxUIComponentCreator linux = new LinuxUIComponentCreator();
		MacUIComponentCreator mac = new MacUIComponentCreator();
		
		windows.show("Button");  // equalsIgnoreCase applicable 
		windows.show("textfield");
		windows.show("checkbox");
		System.out.println("*********************************");
		linux.show("button");
		linux.show("textfield");
		linux.show("checkbox");
		System.out.println("*********************************");
		mac.show("button");
		mac.show("textfield");
		mac.show("checkbox");
		
		
		
	}

}
