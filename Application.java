package client;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		menu();
	}
	
	/*
	 * Menu Application - Bring all the features together into a user-friendly menu
	*/
	public static void menu() {
	    Scanner scanner = new Scanner(System.in);
	    String filePath;

	    while (true) {
	        System.out.println("\nMenu:");
	        System.out.println("1. Analyze File");
	        System.out.println("2. Convert CSV to JSON");
	        System.out.println("3. Search in File");
	        System.out.println("4. Encrypt File");
	        System.out.println("5. Merge Files");
	        System.out.println("6. Extract Metadata");
	        System.out.println("7. Sort File");
	        System.out.println("8. Exit");
	        System.out.print("Enter your choice: ");

	        int choice = scanner.nextInt();
	        scanner.nextLine(); // Consume newline

	        switch (choice) {
	            case 1:
	                System.out.print("Enter file path to analyze: ");
	                filePath = scanner.nextLine();
	                
	                FileAnalysis parsed_file = new FileAnalysis();
	                parsed_file.analyzeFile(filePath);
	                
	                System.out.print("Do you wish to evaluate the current stock analysis for each company?: (Y/N): ");
	                String response = scanner.nextLine().trim().toUpperCase();
	                
	                if(response.equals("Y")) {
	                	System.out.println("Fetching results...\n");
	                	StockAnalysis.findHighestAndLowestPrice(filePath);
	                } else if (response.equals("N")) {
	                	System.out.println("No stock analysis will be displayed.");
	                } else {
	                	System.out.println("Invalid input! Please enter Y(Yes) or N(No).");
	                }
	                break;
	            case 2:
	                System.out.print("Enter CSV file path: ");
	                String csvPath = scanner.nextLine();
	                System.out.print("Enter output JSON path: ");
	                String jsonPath = scanner.nextLine();
	                
	                FileConversion converted_file = new FileConversion();
	                converted_file.convertCsvToJson(csvPath, jsonPath);
	                break;
	            case 3:
	                System.out.print("Enter file path to search: ");
	                filePath = scanner.nextLine();
	                System.out.print("Enter keyword: ");
	                String keyword = scanner.nextLine();
	                String outputFilePath = "export_"+ keyword + ".csv";
	                
	                FileSearch file = new FileSearch();
	                file.searchInFile(filePath, keyword, outputFilePath);
	                break;
	            case 4:
	                System.out.print("Enter first file: ");
	                String file1 = scanner.nextLine();
	                System.out.print("Enter second file: ");
	                String file2 = scanner.nextLine();
	                System.out.print("Enter output file: ");
	                String mergeOutput = scanner.nextLine();
	                
	                FileMerging merged_file = new FileMerging();
	                merged_file.mergeFiles(file1, file2, mergeOutput);
	                break;
	            case 5:
	                System.out.print("Enter file path: ");
	                filePath = scanner.nextLine();
	                
	                FileMetadataExtraction meta_file = new FileMetadataExtraction();
	                meta_file.extractMetadata(filePath);
	                break;
	            case 6:
	                System.out.print("Enter file to sort: ");
	                filePath = scanner.nextLine();
	                System.out.print("Enter output file: ");
	                String sortedOutput = scanner.nextLine();
	                
	                FileSorting sorted_file = new FileSorting();
	                sorted_file.sortFile(filePath, sortedOutput);
	                break;
	            case 7:
	                System.out.println("Goodbye!");
	                scanner.close();
	                return;
	            default:
	                System.out.println("Invalid choice. Try again.");
	        }
	    }
	}
	
}
