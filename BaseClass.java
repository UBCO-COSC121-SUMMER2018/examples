package examples;

public class BaseClass {

	private int a;
	
	public BaseClass()
	{
		a = 0;
	}
	
	
	
	protected int getValue() {
		printMessage();
		return a;
	}

	protected void setValue(int a) {
		this.a = a;
	}
	
	private void printMessage()
	{
		System.out.println("Hi");
	}
	
}
