package examples;

import java.util.Scanner;
import java.util.Stack;

public class Decode {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		Stack<String> word = new Stack<>();
		
		System.out.println("Enter a word:");
		
		String message = in.nextLine();
	
		int index = 0;
		
		while (index < message.length())
		{
			char c = message.charAt(index);
			word.push(Character.toString(c));
			index++;
		}
		
		while (!word.empty())
		{
			System.out.print(word.pop());
		}
	}

}
