import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class NumberStatCounterProgramme {

	public static void main(String[] args) throws IOException {
		
		System.out.print("Input Date :");
		 BufferedReader reader = new BufferedReader(
		            new InputStreamReader(System.in));
		 
		        // Reading date using readLine
		        String date = reader.readLine();
		 
		        // Printing the read line
		        System.out.println("Date :" + date);
		        System.out.println();
		        
		 System.out.print("input filename :");
		 reader = new BufferedReader(
		            new InputStreamReader(System.in));
		 
		        // Reading date using readLine
		        String filename = reader.readLine();
		 
		        // Printing the read line
		        System.out.println("filename :" + filename);
		        System.out.println();
		
		File file = new File("src/"+filename+".txt");
		System.out.println("Number Stats");
		try {
		    Scanner scanner = new Scanner(file);
		    
		    // Section 1 - Get All Stats

		    //now read the file line by line...
		    int lineNum = 0;
		    char[] numAtTheString = new char[4];
		    int[] numStat = new int[10];
		    int[] overallNumber = new int[23];
		    int[] overallNumberStat = new int[23];
		    
		    while (scanner.hasNextLine()) {
		        String line = scanner.nextLine(); // get the number from the line
		        // extracting the number
		        for(int i=0;i<4;i++) {
		        	numAtTheString[i] = (char) Character.getNumericValue(line.charAt(i));
		        	int j = numAtTheString[i];
		        	numStat[j] +=1;
		        }
		        //System.out.println(line);
		        overallNumber[lineNum] = Integer.parseInt(line);
		        lineNum++; 
		    }
		    
		    for(int i=0; i<10; i++) 
		    {
		    System.out.println("Number " +i + " - " + numStat[i]);	
		    }
		    
		    System.out.println();
		    // End Of Section 1
		    
		    // Section 2 - Calculate Overall Score
		    System.out.println("Number Overall Stat");
		    for(int i=0;i<23;i++) {
		    	// Generate Value For Each OverallNumberStat
		    	String tempnumber = String.valueOf(overallNumber[i]);
		    	for(int j = 0; j < tempnumber.length(); j++) {
		    	    int k = Character.digit(tempnumber.charAt(j), 10); // get digit from each string
		    	    // use the k value to add to overallstate using the table
		    	    overallNumberStat[i] += numStat[k];
		    	    //System.out.println("digit: " + k);
		    	}
		    	System.out.println("Number "+ overallNumber[i] + " - " +overallNumberStat[i]);
		    }
		    	System.out.println();
		    // End Of Section 2
		    
		    // Section 3 overall average
		    System.out.println("Number Average");
		    double avgNum =0;
		    for(int i=0;i<23;i++) {
		    	avgNum += overallNumberStat[i];
		    }
		    // average out the number
		    avgNum = avgNum/23;
		    System.out.println("The average Stats is : " +avgNum);
		    
		    
		} catch(FileNotFoundException e) { 
		    //handle this
		}
	}

}
