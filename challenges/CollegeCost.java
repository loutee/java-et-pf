/* Challenge Objectives
 *
 * Compute total yearly cost of college
 * 	Dorm or commuting?
 * 
 * Dorm student
 * 	Duration of stay
 * 	Weekly expenses
 * 	Cost of room and board
 *
 * For all students
 * 	Name
 * 	Year (freshman, sophomore, etc.)
 * 	Cost of supplies (including textbooks)
 * 	Number of credit hours and cost per hour
 *
 * Use methods for each request
 */
import java.util.*;

public class CollegeCost {
	
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		boolean dormStudent = isDormStudent();
		if (dormStudent == true) {
			System.out.println("Student is a dorm student.");
		} else {
			System.out.println("Student is a commuting student.");
		}

		// Get general student information
		String studentName = getStudentName();
		System.out.println("Student's name is: " + studentName);

		String studentYear = getStudentYear();
		System.out.println("Student is in " + studentYear + " year.");
		
		double supplyCost = getSupplyCost();
		System.out.printf("Cost of supplies is $%.2f\n", supplyCost );

		//int creditHours = getCreditHours();
		//double creditCost = getCreditCost();

	}
	
	// Methods for getting general student information

	public static boolean isDormStudent() {
		char response;
		do {
			System.out.println("Specify type of student");
			System.out.println("___________________________________");
			System.out.println("Enter 'D' for dorm student.");
			System.out.println("Enter 'C' for commuting student.");
			response = in.next().charAt(0);
		} while ( response != 'D' && response != 'd' && response != 'C' && response != 'c' );
		
		switch (response) {
			case 'D':
			case 'd':
				return true;
			case 'C':
			case 'c':
				return false;
			default:
				return false;
		}
	}

	public static String getStudentName() {
		String storeStudentName = "";
		System.out.print("Enter student name: ");
		while (storeStudentName.isEmpty()) {	
			storeStudentName = in.nextLine();
		}	
		return storeStudentName;
	}

	public static String getStudentYear() {
		int response;
		do {
			System.out.println("Specify student year");
			System.out.println("_______________________________________");
			System.out.println("Enter '1' for Freshman");
			System.out.println("Enter '2' for Sophomore");
			System.out.println("Enter '3' for Junior");
			System.out.println("Enter '4' for Senior");
			response = in.nextInt();
		} while ( response < 0 && response > 4 );

		switch (response) {
			case 1:
				return "freshman";
			case 2:
				return "sophomore";
			case 3:
				return "junior";
			case 4:
				return "senior";
			default:
				return "freshman";
		}
	}

	public static double getSupplyCost() {
		double storeCost;
		do {
			System.out.print("Enter the cost of supplies: $");
			storeCost = in.nextDouble();
		} while (storeCost < 0);
		return storeCost;
	}

/*
		double generalCost = getStudentInfo();
		double dormCost;

		if (storeStudentType.equals("dorm") {
			dormCost = getDormInfo();
			System.out.println(
		}

	}
*/
}
