package examples;

public class PrivateNodeExampleList {

	private Node head;
	private Node tail;
	
	public PrivateNodeExampleList()
	{
		head = tail = null;			//empty list
	}
	
	public void add(Integer d)
	{
		Node newNode = new Node(d);
		
		if (head == null)
		{
			head = newNode;
			tail = newNode;
		}
		else
		{
			newNode.setPrevious(tail);
			tail.setNext(newNode);
			tail = newNode;
		}
	}
		
	/**
	 * Insert in order!
	 * @param d
	 */
	public void insert(Integer d)
	{
		Node newNode = new Node(d);
		
		if (head == null)
		{
			head = tail = newNode;
		}
		else
		{
			Node it = head;
						
			while (it != null)
			{
				if (it.getData().compareTo(newNode.getData()) < 0)
				{	
					it = it.getNext();
				}
				else
				{
					if (it.getPrevious() == null) // then we are inserting at the start
					{
						newNode.setNext(it);
						it.setPrevious(newNode);
						head = newNode;
						return;
					}
					else{
						newNode.setNext(it);
						newNode.setPrevious(it.getPrevious());
						it.getPrevious().setNext(newNode);
						it.setPrevious(newNode);
						return;
					}
				}
			}
			//if we've made it here, you are at the end!
			//just add to end
			newNode.setPrevious(tail);
			tail.setNext(newNode);
			tail = newNode;
			return;
			
			
		}
		
		
	}
	
	public void print()
	{
		Node it = head;
		
		System.out.println("Start of output");
		
		while (it != null)
		{
			System.out.println(it);
			it = it.getNext();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrivateNodeExampleList l = new PrivateNodeExampleList();
		l.print();
		l.add(3);
		l.print();
		l.add(7);
		l.print();
		l.insert(5);
		l.print();
		l.insert(6);
		l.print();
		l.insert(12);
		l.print();
		l.insert(1);
		l.print();
		
	
	}
	
	/**
	 * Used to support a double linked list
	 *
	 */
	private class Node{
		
		private Integer data;
		private Node next;
		private Node previous;
		
		public Node(Integer data)
		{
			this.data = data;
			next = previous = null;
		}
		
		public Integer getData() {
			return data;
		}
		public void setData(Integer data) {
			this.data = data;
		}
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}
		public Node getPrevious() {
			return previous;
		}
		public void setPrevious(Node previous) {
			this.previous = previous;
		}
		
		public String toString()
		{
			return data.toString();
		}
		
	}
	
}

