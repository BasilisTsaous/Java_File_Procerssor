package client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileMerging {
	public void mergeFiles(String file1, String file2, String outputFile) {
	    try (BufferedReader br1 = new BufferedReader(new FileReader(file1));
	         BufferedReader br2 = new BufferedReader(new FileReader(file2));
	         BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {

	        String line;
	        while ((line = br1.readLine()) != null) bw.write(line + "\n");
	        while ((line = br2.readLine()) != null) bw.write(line + "\n");

	        System.out.println("Files merged into: " + outputFile);
	    } catch (IOException e) {
	        System.err.println("Error merging files: " + e.getMessage());
	    }
	}
}
