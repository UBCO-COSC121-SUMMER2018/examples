package poly;

public class Circle {

	private int diameter;
	
	public Circle(int d)
	{
		diameter = d;
	}
	
	public int getDiameter()
	{
		return diameter;
	}
	
	public String toString()
	{
		return "this is a circle of diameter " + diameter;
	}
	
	public void testType(Object o)
	{
		if (o instanceof Circle)
		{
			System.out.println("This is a circle");
		}
		else
		{
			System.out.println("This is not a circle");
		}

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Object o = new Circle(10);
		
		System.out.println(o);
		//Use the getDiameter method
		System.out.println(((Circle)o).getDiameter());
		
		//This will test the type of object
		((Circle)o).testType(o);
		Object p = "Hello";
		((Circle)o).testType(p);
		System.out.println(((Circle)p).getDiameter());
	}
	
}

