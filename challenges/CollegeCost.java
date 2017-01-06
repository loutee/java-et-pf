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
		String studentYear = getStudentYear();
		double supplyCost = getSupplyCost();
		int creditHours = getCreditHours();
		double creditRate = getCreditRate();

		System.out.println("\nStudent's name is: " + studentName);
		System.out.println(studentName + " is a " + studentYear);
		System.out.printf("Cost of supplies is $%.2f\n", supplyCost );
		System.out.println("Number of credit hours is " + creditHours);
		System.out.printf("Cost per credit hour is $%.2f\n", creditRate);

		double totalCost;
		// Get dorm student infomation if applicable
		if (dormStudent == true) {
			int stayDuration = getDuration();
			double weeklyExpenses = getWeeklyExpenses();
			double rbCost = getRBCost();
			System.out.println("__________________________________________\n");		
			totalCost = getTotalCost( creditHours, creditRate, supplyCost, stayDuration, weeklyExpenses, rbCost);	
			System.out.printf("Total cost is $%.2f\n", totalCost);
		} else {
			System.out.println("__________________________________________\n");		
			totalCost = getTotalCost( creditHours, creditRate, supplyCost);
			System.out.printf("Total cost is $%.2f\n", totalCost);
		}

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

	public static int getCreditHours() {
		int storeHours;
		do {
			System.out.print("Enter number of credit hours: ");
			storeHours = in.nextInt();
		} while (storeHours < 0);
		return storeHours;
	}

	public static double getCreditRate() {
		double storeRate;
		do {
			System.out.print("Enter cost per credit hour: $");
			storeRate = in.nextDouble();
		} while (storeRate < 0);
		return storeRate;
	}

	// Methods for getting dorm student information

	public static int getDuration() {
		int storeDuration;
		do {
			System.out.print("Enter duration of stay (weeks): ");
			storeDuration = in.nextInt();
		} while (storeDuration < 0);
		return storeDuration;
	}

	public static double getWeeklyExpenses() {
		double storeWeeklyExpenses;
		do {
			System.out.print("Enter cost of weekly expenses: $");
			storeWeeklyExpenses = in.nextDouble();
		} while (storeWeeklyExpenses < 0);
		return storeWeeklyExpenses;
	}

	public static double getRBCost() {
		double storeRBCost;
		do {
			System.out.print("Enter room and board cost: $");
			storeRBCost = in.nextDouble();
		} while (storeRBCost < 0);
		return storeRBCost;
	}
	
	// Methods for calculating total

	public static double getTotalCost(int hours, double rate, double supply) {
		return rate * (double) hours + supply;
	}

	public static double getTotalCost(int hours, double rate, double supply, int duration, double weeklyExpenses, double rbCost) {
		return ( (rate * (double) hours + supply) + (weeklyExpenses * (double) duration + rbCost) );
	}
}
