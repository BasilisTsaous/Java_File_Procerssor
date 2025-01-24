package client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileSearch {
	
    public void searchInFile(String filePath, String keyword, String outputFilePath) {
        File inputFile = new File(filePath);
        File outputFile = new File(outputFilePath);

        // List to hold the matching lines
        List<String> matchingLines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            boolean headerWritten = false;

            // Read the input file line by line
            while ((line = reader.readLine()) != null) {
                // Check if the line contains the keyword
                if (line.toLowerCase().contains(keyword.toLowerCase())) {
                    matchingLines.add(line);

                    // Write the header only once (if found in the first line)
                    if (!headerWritten) {
                        writer.write(line); // Assuming the first line is the header
                        writer.newLine();
                        headerWritten = true;
                    } else {
                        // Write the matching line to the output file
                        writer.write(line);
                        writer.newLine();
                    }
                }
            }

            // Display the matching lines in the console
            System.out.println("Search results for keyword \"" + keyword + "\":");
            for (String matchingLine : matchingLines) {
                System.out.println(matchingLine);
            }

            System.out.println("\nMatching lines have been saved to: " + outputFilePath);

        } catch (IOException e) {
            System.err.println("An error occurred while processing the file: " + e.getMessage());
        }
    }
}
