package Task12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FilenotFound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        String filePath = "sample.txt";

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
