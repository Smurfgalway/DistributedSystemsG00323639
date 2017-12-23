package distributedsystemsproject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
	public static void main(String[] args) throws IOException {
	// open file input stream
			BufferedReader reader = new BufferedReader(new FileReader(
					"C:\\Users\\root\\eclipse-workspace\\distributedsystemsproject\\src\\dictionary.csv")); 
			// root will need to be changed to local save of the dictonary cs as it does not recognise the csv file path otherwise

			// read file line by line
			String line = null;
			Scanner scanner = null;

			while ((line = reader.readLine()) != null) {
				scanner = new Scanner(line);
				scanner.useDelimiter(",");
				while (scanner.hasNext()) {
					String data = scanner.nextLine(); // reads the csv file line by line
					
						System.out.println(data); // prints out the dictionary csv file to the console
				}
			}
			
			//close reader
			reader.close();
			
			
		}

}
