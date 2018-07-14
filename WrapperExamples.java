package exampes;

public class WrapperExamples {

	public static void p(int num)
	{
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Integer class
		System.out.println(new Integer(3).compareTo(10));
		int a = (int)19.5;   	//narrowing 
		double b = 19;			//widening
	
		p("ADC".compareTo("ACD"));
		
		//This won't work
		//String s = new Object();
		
	}

}
