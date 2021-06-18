import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NumberStatCounterProgramme {

	public static void main(String[] args) {
		File file = new File("src/Sample.txt");

		try {
		    Scanner scanner = new Scanner(file);

		    //now read the file line by line...
		    int lineNum = 0;
		    while (scanner.hasNextLine()) {
		        String line = scanner.nextLine();
		        System.out.println("ho hum, i found it on line " +line);
		        lineNum++; 
		    }
		} catch(FileNotFoundException e) { 
		    //handle this
		}
	}

}
