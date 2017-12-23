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

			// read file line by line
			String line = null;
			Scanner scanner = null;
			List<DictionaryService> dictList = new ArrayList<>();

			while ((line = reader.readLine()) != null) {
				DictionaryService dict = new DictionaryService();
				scanner = new Scanner(line);
				scanner.useDelimiter(",");
				while (scanner.hasNext()) {
					String data = scanner.nextLine();
					
						System.out.println(data);
				}
			}
			
			//close reader
			reader.close();
			
			
		}

}
