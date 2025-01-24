package client;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class FileAnalysis {
	
	public void analyzeFile(String filePath) {
	    try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
	    	
	        String line;
	        int lineCount = 0;
        	int wordCount = 0; 
        	int charCount = 0;
        	
            // Read the header (first line) and extract attribute names
            String header = br.readLine();
            if (header != null) {
                lineCount++; // Count the header as the first line
                charCount += header.length(); // Count characters in the header

                // Split the header to extract attribute names
                String[] attributes = header.split(",");
                System.out.println("Header: " + Arrays.toString(attributes)); // Print column headers for reference
            }
        	// Process the rest of the file
	        while ((line = br.readLine()) != null) {
	            lineCount++;
	            wordCount += line.split("\\s+").length; // Splitting by spaces
	            charCount += line.length();
	        }

	        System.out.println("Lines: " + lineCount);
	        System.out.println("Words: " + wordCount);
	        System.out.println("Characters: " + charCount);
           } catch (IOException e) {
	        System.err.println("Error analyzing the file: " + e.getMessage());
	        }
	    }
	}
	    	    