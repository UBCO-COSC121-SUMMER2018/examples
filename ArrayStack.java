package examples;

public class ArrayStack {

	private int tos;
	
	Integer array[];
	
	public ArrayStack(int capacity)
	{
		array = new Integer[capacity];
		tos = 0;
	}
	
	public void push(Integer i)
	{
		if(!isFull()) //check to see if it is full
		{
			array[tos] = i;
			tos++;
		}
	}
	
	public Integer pop()
	{
		if (!isEmpty())
		{
			tos--;
			Integer value = array[tos];
			array[tos] = null;
			return value;
		}
		else
			return null;
		}
	
	public Integer peek()
	{
		if (!isEmpty())
		{
			return array[tos - 1];
		}
		else
			return null;
		}
	public boolean isFull()
	{
		if (tos == array.length)
			return true;
		else
			return false;
		//return (count == array.length;
	}
	
	public boolean isEmpty()
	{
		if (tos == 0)
			return true;
		else 
			return false;
	}
	
	public void printStack()
	{
		for (int idx = 0; idx < array.length ; idx ++)
		{
			System.out.println(array[idx]);
		}
		System.out.println("tos: " + tos);
		System.out.println("Is full?: " + this.isFull()); 
		System.out.println("Is empty?: " + this.isEmpty()); 
	}
	
	public static void main(String[] args) {

		ArrayStack aq = new ArrayStack(5);
		
		System.out.println("Empty status: " + aq.isEmpty());
		aq.printStack();
		aq.push(1);
		aq.printStack();
		aq.push(2);
		aq.printStack();
		aq.push(3);
		aq.printStack();
		aq.push(4);
		aq.printStack();
		aq.push(5);
		aq.printStack();
		aq.push(6);
		aq.printStack();
		System.out.println("Pop: " + aq.pop());
		aq.printStack();
		aq.push(6);
		aq.printStack();
		System.out.println("Pop: " + aq.pop());
		System.out.println("Pop: " + aq.pop());
		System.out.println("Pop: " + aq.pop());
		System.out.println("Pop: " + aq.pop());
		System.out.println("Pop: " + aq.pop());
		System.out.println("Pop: " + aq.pop());
		aq.printStack();

		
	}

}
