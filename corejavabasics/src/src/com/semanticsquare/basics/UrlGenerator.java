package src.com.semanticsquare.basics;

public class UrlGenerator {
	
	private static String[] specialChars = {"!", ",", ":", "_", "-", "'", "$", "."};
	
	public static String generatePathVariable(String title) {

	String[] splitString;
	String[] truncateString = new String[7];

	if(title == null || title.isEmpty()) {
	    return null;
	}else {

		title = title.toLowerCase();

		title = title.trim();

		for (String special : specialChars ){

			title = title.replace(special, "");
		}

		splitString = title.split(" ");

		for(int j=0; j<7; j++){
		truncateString[j] = splitString[j];
		}

		title = String.join("-", truncateString);
	
		System.out.println("\n pathVar is: " + title);

	}
        // 1. Return null if title is null or empty string ("")
    	    	
    	// 2. Convert to lower case
		
    	// 3. Trim any leading & trailing whitespace in title. Hint: Use trim()
		
    	// 4. Replace any special characters with empty string "". Hint: replace() and not replaceAll()
		 	
    	// 5. Replace " " with "-". Use a maximum of 7 words from title. Hint: Use split & join
    	                
        return title;
    }

   
    public static void main(String[] args) {
    	String title = "   Java In-Depth: Become a Complete Java Engineer!";
    	String pathVariable = generatePathVariable(title);    	
    	System.out.println(title);
    	System.out.println(pathVariable);
    	
    	title = "Head First Design Patterns: Building Extensible and Maintainable Object-Oriented Software";//" Head First Jav'a ";
    	pathVariable = generatePathVariable(title);
    	System.out.println("\n" + title);
    	System.out.println(pathVariable);
    	
	}

}
