package examples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int a = 0;
		
		try{
			
		a = s.nextInt();
		}
		catch(InputMismatchException e)
		{
			System.out.println("this only accepts numbers!");
		}
		
		System.out.println("Enter a second number");
		
		int b = s.nextInt();
		
		try
		{
			int c = a/b;
			System.out.println(a + "divided by "+b+ " is " + c);
		}
		catch(Exception e)
		{
			System.out.println("There is an error in the calculation.");
		}
	}

}
