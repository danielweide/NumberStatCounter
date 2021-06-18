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
		    int actualNum=0;
		    char[] numAtTheString = new char[4];
		    int[] numStat = new int[10];
		    
		    while (scanner.hasNextLine()) {
		        String line = scanner.nextLine(); // get the number from the line
		        //actualNum = Integer.parseInt(line);
		        // extracting the number
		        for(int i=0;i<4;i++) {
		        	numAtTheString[i] = (char) Character.getNumericValue(line.charAt(i));
		        	int j = numAtTheString[i];
		        	numStat[j] +=1;
		        }
		        System.out.println(line);
		        lineNum++; 
		    }
		} catch(FileNotFoundException e) { 
		    //handle this
		}
	}

}
