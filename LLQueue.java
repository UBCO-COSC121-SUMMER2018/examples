package examples;

public class LLQueue {

	private MyLLNode front;  //new data at this end
	private MyLLNode back;	//old data here
		
	public LLQueue()
	{
		front = back = null;
	}
	
	public void enqueue(Integer i)
	{
		if(!isFull()) //check to see if it is full
		{
			MyLLNode newNode = new MyLLNode(i);
			if (isEmpty())
			{
				front = newNode;
				back = newNode;
				return;
			}
			{
				front.setNext(newNode);
				front = newNode;
			}
		}
	}
	
	public Integer dequeue()
	{
		if (!isEmpty())
		{
			Integer value = back.getData();
			MyLLNode temp = back;
			back = back.getNext();
			temp.setNext(null);
			return value;
		}
		else
			return null;
		}
	
	public boolean isFull()
	{
		return false;	
	}
	
	public boolean isEmpty()
	{
		if ((front == null) && (back == null))
			return true;
		else 
			return false;
	}
	
	public void printQueue()
	{
		MyLLNode it = back;
		
		while (it != null)
		{
			System.out.println(it.getData());
			it = it.getNext();
		}
		
		System.out.println("Is full?: " + this.isFull()); 
		System.out.println("Is empty?: " + this.isEmpty()); 
	}
	
	public static void main(String[] args) {

		LLQueue aq = new LLQueue();
		
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
