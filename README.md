# Stock Data File Processor

This project is a Java-based application designed to showcase file-handling and data manipulation techniques. It uses stock market data from the **Top 10 Global Companies Stock Data 2024** dataset to demonstrate how to work with CSV files programmatically.

## Features

This program includes the following functionalities in their respective classes:

1. **Analyze File Content**: Calculate the number of lines, words, and characters in the dataset.
2. **Stock Price Insights**: Identify the highest and lowest stock prices for each company. Display additional attributes (e.g., date, open price, close price, volume) for those prices.
3. **Convert CSV to JSON**: Transform the stock market data from CSV to JSON format for easy integration with modern web applications.
4. **Search in File**: Search for specific companies, stock symbols, or dates within the dataset and if required store the results in different csv files.
5. **Merge Files**: Combine multiple CSV files into a single file for consolidated analysis.
6. **Extract Metadata**: Retrieve and display file metadata such as size, creation date, and last modified date.
7. **Sort Files**: Sort data by specific columns such as `Date`, `Stock Symbol`, or `Closing Price`.
8. **Interactive User Experience**: Includes a user-friendly application menu and a prompt asking if the user wishes to see stock analysis for each company.

## How It Works

### Program Flow:

1. **Input**:
   - The user provides a CSV file containing stock market data.
2. **Processing**:
   - Various functionalities (search, sort, analyze, etc.) are applied to the dataset based on user needs.
3. **Output**:
   - Insights, processed files, and console output results.

## Dataset

This project uses the **[Top 10 Global Companies Stock Data 2024](https://www.kaggle.com/datasets/your-dataset-link)** dataset from Kaggle.

### Dataset Information:

- **Description**: Contains stock data for the top 10 global companies, including their daily prices, trading volumes, and other key metrics.
- **Columns**:
  - `Date`: The date of the trading session.
  - `Company`: The name of the company.
  - `Stock Symbol`: The company's stock ticker symbol.
  - `Open`: Opening price of the stock.
  - `High`: Highest price during the session.
  - `Low`: Lowest price during the session.
  - `Close`: Closing price of the stock.
  - `Adj Close`: The closing price after adjustments for all applicable splits and dividend distributions.
  - `Volume`: Total number of shares traded during the session.

## Technologies Used

Programming Language: Java
File Handling: Java IO (BufferedReader, BufferedWriter, etc.)
Data Structures: HashMaps, Lists , Arrays

## Prerequisites

## The code for this project was implemented in Eclipse IDE.

- Java Development Kit (JDK) 8 or later.
- Basic Java programming knowledge.
- The dataset downloaded from Kaggle.
- Use any Java IDE like IntelliJ IDEA, Eclipse, or NetBeans.

## Acknowledgments

Dataset: Top 10 Global Companies Stock Data 2024

Thanks to Kaggle and the open-source community for providing this dataset.

