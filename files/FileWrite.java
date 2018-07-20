package examples.files;

import java.io.File;
import java.io.PrintWriter;

public class FileWrite {

	public static void main(String[] args) {
		
		File myFile = new File("c:\\test\\ex2.txt");
		
		if(myFile.exists())
		{
			System.out.println("File exists");;
			System.exit(0);
		}
		
		try{
			
		PrintWriter pw = new PrintWriter(myFile);
		
		for (int i = 0; i < 100; i++)
		{
			pw.println("This is line " + i + ".");
		}
		//pw.println("This is line two.");
		pw.close();
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
