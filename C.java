package examples;

public class C extends B {
	
	protected int c = 30;
	
	public C()
	{
		
	}

	public void thisIsC()
	{
		super.a = 10;
		
		//This is not available as i is private
		//i = 30;
		
	}
}