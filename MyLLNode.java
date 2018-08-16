package examples;

public class MyLLNode {

	//next pointer
	private MyLLNode next = null;
	//data
	private Integer data = null;
	
	public MyLLNode(Integer i)
	{
		data = i;
		next = null;
	}
	
	public Integer getData() {
		return data;
	}

	public void setData(Integer data) {
		this.data = data;
	}

	public MyLLNode getNext() {
		return next;
	}

	public void setNext(MyLLNode next) {
		this.next = next;
	}
	
	
	
}
