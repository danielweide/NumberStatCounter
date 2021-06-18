import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class NumberStatReference {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.print("Input Date :");
		 BufferedReader reader = new BufferedReader(
		            new InputStreamReader(System.in));
		 
		        // Reading date using readLine
		        String date = reader.readLine();
		 
		        // Printing the read line
		        System.out.println("Date :" + date);
		        System.out.println();
		        
		 System.out.print("input Reference filename :");
		 reader = new BufferedReader(
		            new InputStreamReader(System.in));
		 
		        // Reading date using readLine
		        String filename = reader.readLine();
		 
		        // Printing the read line
		        System.out.println("Reference filename :" + filename);
		        System.out.println();
		
		File file = new File("src/"+filename+".txt");
		System.out.println("Number Stats");
		try {
		    Scanner scanner = new Scanner(file);
		    
		    // Section 1 - Get the reference notes

		    //now read the file line by line...
		    int lineNum = 0;
		    char[] numAtTheString = new char[4];
		    int[] numStat = new int[10];
		    int[] overallNumber = new int[23];
		    int[] overallNumberStat = new int[23];
		    
		    while (scanner.hasNextLine()) {
		        String line = scanner.nextLine(); // get the number from the line
		        // retrieve the number and store at  numStat
		        numStat[lineNum] = Integer.parseInt(line);
		        lineNum++; 
		    }
		    
		    System.out.println();
		    // End Of Section 1
		    
		    // Section 1.5 - Preload the Num
		    // Printing the read line
		    System.out.print("input Number filename :");
			 reader = new BufferedReader(
			          new InputStreamReader(System.in));
			 
			 // Reading date using readLine
			filename = reader.readLine();
	        System.out.println("filename :" + filename);
	        System.out.println();
	
	        file = new File("src/"+filename+".txt");
	        System.out.println("Number Stats");
	        try {
	        	scanner = new Scanner(file);

	        //now read the file line by line...
	        lineNum = 0;
	    
	    while (scanner.hasNextLine()) {
	        String line = scanner.nextLine(); // get the number from the line
	        // extracting the number
	        overallNumber[lineNum] = Integer.parseInt(line);
	        lineNum++; 
	    }
	    
	        }catch(FileNotFoundException e) { 
		    //handle this
		}
	    
	    System.out.println();

	    // End Of Section 1.5
	    
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
		// End Of Section 2
		
		
		// Section 3 - Get Overall Average
	    System.out.println("Number Average");
	    double avgNum =0;
	    for(int i=0;i<23;i++) {
	    	avgNum += overallNumberStat[i];
	    }
	    // average out the number
	    avgNum = avgNum/23;
	    System.out.println("The average Stats is : " +avgNum);
	    
		// End of Section 3
	}catch(FileNotFoundException e) { 
	    //handle this
	}
		
	}

}
