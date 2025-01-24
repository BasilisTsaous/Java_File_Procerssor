package client;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class FileMetadataExtraction {
	public void extractMetadata(String filePath) {
	    try {
	        Path path = Paths.get(filePath);
	        BasicFileAttributes attributes = Files.readAttributes(path, BasicFileAttributes.class);

	        System.out.println("File Metadata:");
	        System.out.println("Creation Time: " + attributes.creationTime());
	        System.out.println("Last Modified Time: " + attributes.lastModifiedTime());
	        System.out.println("File Size: " + attributes.size() + " bytes");
	    } catch (IOException e) {
	        System.err.println("Error reading metadata: " + e.getMessage());
	    }
	}
}
