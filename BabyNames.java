import java.util.Scanner;

public class BabyNames {
	public static void main(String[] args) {   
		String returnedString = getFromWeb();
		if (returnedString == "IO Errors") { // Check for and report on the three possible error types returned by the function as strings.
			System.out.println("IO Errors");
		}
		else if (returnedString == "Invalid URL") {
			System.out.println("Invalid URL");
		}
		else if (returnedString == "Unexpected Exception") {
			System.out.println("Unexpected Exception");
		}
		else {
			String Duplicates = getDuplicates(returnedString);
			if (Duplicates == "Unexpected Exception") { // In the case of an error, report it to the user.
				System.out.println("Unexpected Exception");
			}
			else {
				System.out.println(Duplicates.split(",").length + " names are used for both genders."); // Display the number of duplicated names, and list the names.
				System.out.println("They are " + Duplicates);
			}
		}
		
	}
	public static String getFromWeb() {
		try {
			java.net.URL url = new java.net.URL("https://liveexample.pearsoncmg.com/data/babynameranking2001.txt"); // Open the URL and load its contents into a scanner.
			String CSVFile = "";
			Scanner input = new Scanner(url.openStream());
			
			while (input.hasNext()) { // Read each line, format it, and add it to the comma-separated version of the document.
				String line = input.nextLine();
				String name = line.replaceAll(" ", "");
				name = name.replaceAll("0", "");
				name = name.replace("1", "");
				name = name.replace("2", "");
				name = name.replace("3", "");
				name = name.replace("4", "");
				name = name.replace("5", "");
				name = name.replace("6", "");
				name = name.replace("7", "");
				name = name.replace("8", "");
				name = name.replace("9", "");
				name = name.replace("\t", ",");
				name = name.trim();
				CSVFile += name;
			}
			
			CSVFile = CSVFile.replaceAll(",,", ","); // This line and the next are both necessary in order to remove instances where three commas are included. 
			CSVFile = CSVFile.replaceAll(",,", ",");
			return CSVFile;
		}
		catch (java.net.MalformedURLException ex) { // In the case of an error, return a string representation of it.
			return "Invalid URL";
		}
		catch (java.io.IOException ex) {
			return "IO Error";
		}
		catch (Exception ex) {
			return "Unexpected Exception";
		}
	}
	public static String getDuplicates(String passedString) {
		try {
			String[] asArr = passedString.split(","); // Create (and in some cases initialize) the variables necessary for the name search. 
			String Name;
			String DuplicatedNames = "";
			for (int i=0; i < asArr.length; i++) { // Loop through each name.
				Name = asArr[i]+",";
				if (passedString.indexOf(Name) != passedString.lastIndexOf(Name)) { // Check that the name occurs twice in the list.
					if (DuplicatedNames.indexOf(Name) == -1) { // Prevent listing duplicates for both instances in the final list.
						DuplicatedNames += Name + " ";  
					}
				}
			}
			DuplicatedNames = DuplicatedNames.substring(2,DuplicatedNames.length()-2); // Fix formatting issues in DuplicatedNames.
			return DuplicatedNames;
		}
		catch (Exception ex) { // In the case of an error, return a string representation of it.
			return "Unexpected Exception";
		}
	}
}   