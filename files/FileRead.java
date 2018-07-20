package examples.files;

import java.io.File;
import java.util.Scanner;

public class FileRead {

	public static void main(String[] args) {
		
		File myFile = new File("c:\\test\\ex2.txt");
		
		if(myFile.exists())
		{
			try{
				
				//FileReader fr = new FileReader(myFile);
				//FileInputStream inStream = new FileInputStream(myFile);
				Scanner s = new Scanner(myFile);
				
				
				while(s.hasNextLine())
				{
					System.out.println(s.nextLine());
				}
				
				s.close();
							
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
		}
		
		

	}

}
