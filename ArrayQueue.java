package examples;

public class ArrayQueue {

	private int front;
	private int back;
	private int count;
	
	Integer array[];
	
	public ArrayQueue(int capacity)
	{
		array = new Integer[capacity];
		front = 0;
		back = front + 1;		//This is my empty condition
		count = 0;
	}
	
	public void enqueue(Integer i)
	{
		if(!isFull()) //check to see if it is full
		{
			//Front = Front + 1
			front = (front + 1) % array.length;
			//insert value at front
			array[front] = i;
			count ++;
		}
	}
	
	public Integer dequeue()
	{
		if (!isEmpty())
		{
			Integer value = array[back];
			array[back] = null;
			back = (back + 1) % array.length;
			count --;
			return value;
		}
		else
			return null;
		}
	
	public boolean isFull()
	{
		if (count == array.length)
			return true;
		else
			return false;
		//return (count == array.length;
	}
	
	public boolean isEmpty()
	{
		if ((back == ((front + 1) % array.length)) && (count == 0))
			return true;
		else 
			return false;
	}
	
	public void printQueue()
	{
		for (int idx = 0; idx < array.length ; idx ++)
		{
			System.out.println(array[idx]);
		}
		System.out.println("front: " + front);
		System.out.println("back: " + back);
		System.out.println("Is full?: " + this.isFull()); 
		System.out.println("Is empty?: " + this.isEmpty()); 
	}
	
	public static void main(String[] args) {

		ArrayQueue aq = new ArrayQueue(5);
		
		System.out.println("Empty status: " + aq.isEmpty());
		aq.printQueue();
		aq.enqueue(1);
		aq.printQueue();
		aq.enqueue(2);
		aq.printQueue();
		aq.enqueue(3);
		aq.printQueue();
		aq.enqueue(4);
		aq.printQueue();
		aq.enqueue(5);
		aq.printQueue();
		aq.enqueue(6);
		aq.printQueue();
		System.out.println("Dequeue: " + aq.dequeue());
		aq.printQueue();
		aq.enqueue(6);
		aq.printQueue();
		System.out.println("Dequeue: " + aq.dequeue());
		System.out.println("Dequeue: " + aq.dequeue());
		System.out.println("Dequeue: " + aq.dequeue());
		System.out.println("Dequeue: " + aq.dequeue());
		System.out.println("Dequeue: " + aq.dequeue());
		System.out.println("Dequeue: " + aq.dequeue());
		aq.printQueue();

		
	}

}
