package examples;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("Good");
		al.add("Morning");
		System.out.println(al.toString());
		
		//print out contents
		for(int i = 0; i < al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		//remove something - has two elemets
		System.out.println(al.get(1));
		al.remove(0);
		
		try{
			//this will generate an out of bounds err.
			System.out.println(al.get(1));
		}catch(Exception e)
		{	
			e.printStackTrace();
			
		}
		System.out.println("The end");
		
		
		
	}

}
