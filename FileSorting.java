package client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileSorting {
	public void sortFile(String inputFile, String outputFile) {
	    try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
	         BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {

	        List<String> lines = new ArrayList<>();
	        String line;

	        while ((line = br.readLine()) != null) {
	            lines.add(line);
	        }
	        
	        //By default,the method sorts the file alphabetically by the first column(ie.Date)  
	        Collections.sort(lines);

	        for (String sortedLine : lines) {
	            bw.write(sortedLine + "\n");
	        }

	        System.out.println("File sorted: " + outputFile);
	    } catch (IOException e) {
	        System.err.println("Error sorting file: " + e.getMessage());
	    }
	}
}
