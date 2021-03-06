/* Challenge Objectives
 * 
 * 	Create an ordering application
 * 	Requires the comparable interface
 * 	This is for a pizza shop
 * 	Two types of pizza: Regular and Sicilian
 * 	Use compareTo based on size
 * 	Instance data should be
 * 		Size
 * 		Type
 * 		Toppings (ArrayList of strings)
 * 		Cost
 * 	Main program
 * 		Customer name
 * 		Type and size
 * 		Number of toppings
 * 			Up to 4 for regular
 * 			Up to 2 for Sicilian
 * 		Print out the total for the order
 */

package pizzashop;
import java.util.*;

public class PizzaShop {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter customer name: ");
		String name = in.nextLine();

		//For ArrayList example
		ArrayList<Pizza> pizzas = new ArrayList<Pizza>();
		String response = "y";
		while (response.equals("y")) {

			System.out.println("What type of pizza would you like, regular"
								+ " or sicilian?");
			String type = in.nextLine();
			
			if (type.equalsIgnoreCase("regular")) {
				System.out.println("What size? S, M, L, X?");
				String size = in.nextLine();
				Regular pizza1 = new Regular();
				switch (size) {
					case "S":
					case "s":
						pizza1 = new Regular(12);
						break;
					case "M":
					case "m":
						pizza1 = new Regular(14);
						break;
					case "L":
					case "l":
						pizza1 = new Regular(16);
						break;
					case "X":
					case "x":
						pizza1 = new Regular(18);
						break;
					default:
						break;
				}

				pizza1.getToppings();

				// Commented out for ArrayList example
				// pizza1.printString();
				
				pizzas.add(pizza1);

			} else {
				System.out.println("What size? S, M, L?");
				String size = in.nextLine();
				Sicilian pizza1 = new Sicilian();
				
				switch (size) {
					case "S":
					case "s":
						pizza1 = new Sicilian(10);
						break;
					case "M":
					case "m":
						pizza1 = new Sicilian(12);
						break;
					case "L":
					case "l":
						pizza1 = new Sicilian(14);
						break;
					default:
						break;
				}

				pizza1.getToppings();			
				
				//pizza1.printString();

				pizzas.add(pizza1);

			}
				System.out.println("Do you want to order another pizza? (y/n)");
				response = in.nextLine();

		}
		/*
		for (int i = 0; i < pizzas.size(); i++) {
			pizzas.get(i).printString();
		}
		 */
		
		// Enhanced for loop implementation
		for (Pizza p : pizzas) {
			p.printString();
		}
	}
}
