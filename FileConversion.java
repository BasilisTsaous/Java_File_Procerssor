package client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileConversion {
	public void convertCsvToJson(String csvFile, String jsonFile) {

	    try (BufferedReader br = new BufferedReader(new FileReader(csvFile));
	         BufferedWriter bw = new BufferedWriter(new FileWriter(jsonFile))) {

	        String[] headers = br.readLine().split(",");
	        String line;

	        bw.write("[\n");
	        while ((line = br.readLine()) != null) {
	            String[] values = line.split(",");
	            bw.write("  {\n");
	            for (int i = 0; i < headers.length; i++) {
	                bw.write("    \"" + headers[i] + "\": \"" + values[i] + "\"");
	                if (i < headers.length - 1) bw.write(",");
	                bw.write("\n");
	            }
	            bw.write("  },\n");
	        }
	        bw.write("]");
	        System.out.println("CSV converted to JSON: " + jsonFile);
	    } catch (IOException e) {
	        System.err.println("Error converting file: " + e.getMessage());
	    }
	}
}
