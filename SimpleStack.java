package examples;

import java.util.ArrayList;

public class SimpleStack {

	ArrayList<Integer> al = new ArrayList<>();
	
	public SimpleStack()
	{
		al.clear();
	}
	
	public void push(Integer i)
	{
		al.add(i);
	}
	
	public Integer peek()
	{
		//only remove if there is something on the stack
		if (!(al.isEmpty()))
		{
			int lastIndex = al.size() - 1;
			return al.get(lastIndex);
		}
		else
		{
			return null;
		}
	}
	
	public Integer pop()
	{
		//only remove if there is something on the stack
		if (!(al.isEmpty()))
		{
			int lastIndex = al.size() - 1;
			return al.remove(lastIndex);
		}
		else
		{
			return null;
		}
	}
	
	
	public String toString()
	{
		return al.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleStack s = new SimpleStack();
		System.out.println(s);
		s.push(1);
		System.out.println(s);
		s.push(2);
		System.out.println(s);
		s.push(3);
		System.out.println(s);
		
		while (s.peek() != null)
		{
			System.out.println(s.peek());
			System.out.println("Pop: " + s.pop());
		}

	}

}
