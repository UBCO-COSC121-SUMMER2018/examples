package exampes;

public class ChildClass extends BaseClass {

	
	public ChildClass()
	{
		super();
	}
	
/*	protected int getValue()
	{
		return super.getValue();
		//return a;
	}
*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass c = new ChildClass();
		
		System.out.println(c.getValue());
	}

}
