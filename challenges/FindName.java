//package findname;
import java.util.*;

/**
 *
 * @author Peggy Fisher
 *
 * Challenge Objectives
 * 	Create the name search game
 * 		Start with a 2D array of names
 * 		Ask the user to "guess a name"
 * 		Use a method to search the array
 */
public class FindName {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[][] names = {{"Mickey", "Mouse"},
            {"Donald", "Duck"},
            {"Goofy", "Pluto"},
            {"Snow", "White"},
            {"James", "Bond"},
            {"Doc", "Sneezy"},
            {"Scotty", "Jimmy"},
            {"Peggy", "Sandy"},
            {"Joe", "Sean"},
            {"Alice", "Mackenzie"},
            {"Reshmi", "Vasant"},
            {"Steve", "Rae"}};
        //ask the user to enter a name, then pass the name and array to 
        //the method to search for that name. 
		String first = new String();
		String last = new String();

		if (args.length != 0) {
			first = args[0];
			last = args[1];
		} else {
			Scanner in = new Scanner(System.in);
			System.out.printf("Enter name (first then last): ");
			String inName = in.nextLine();
			String[] splitName = inName.split(" ");
			first = splitName[0];
			last = splitName[1];
		}

		System.out.println("Searching for " + first + " " + last + "...");

		if (nameSearch(first, last, names)) {
			System.out.println(first + " " + last + " is in the list!");
		} else {
			System.out.println(first + " " + last + " is not in the list.");
		}
    }

	// Method
	public static boolean nameSearch(String first, String last, String[][] narr) {
		for (String[] name : narr) {
			if ( (name[0].equalsIgnoreCase(first)) && (name[1].equalsIgnoreCase(last)) ) {
				return true;
			}
		}
		return false;
	}
    
}
