package Task11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileException {

	public static void main(String[] args) {
		// TODO Auto-generated method 

	
		        String filePath = "test.txt";

		        try {
		            File file = new File(filePath);
		            Scanner scanner = new Scanner(file);
		            while (scanner.hasNextLine()){
		                String line = scanner.nextLine();
		                System.out.println("line = " + line);
		            }
		        } catch (FileNotFoundException e) {
		            System.out.println(" The file " + filePath + " does not exist ");

	}
	}
}
