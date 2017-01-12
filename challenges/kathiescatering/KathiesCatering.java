/* Challenge: Kathie's Catering
 * Objectives
 * 	Constructors for the Event class
 * 		Only the even name is known
 * 		Event time and date
 *		Event name, date, and number of guests
 *
 *	Accessor and mutator methods
 *		Set and get methods for all instance data
 *		Calculate total method
 *		Event name, date, and number of guests
 *
 *	Main
 *		Contains helper methods for all data
 *		Creates an event object
 *		Prints the event
 */

package kathiescatering;

import java.util.*;
import java.text.*;

public class KathiesCatering {

	// Set Time Format
	private static String DATE_PART = "dd/MM/yyyy";
	private static String HOUR_PART = "HH:mm";
	private static SimpleDateFormat ft = 
	    new SimpleDateFormat (DATE_PART + " " + HOUR_PART);

	public static void main(String[] args) {


		// Initialize Events

		// Name only
		Event e1 = new Event("SFU CSSS Hackathon");

		// Date and time
		Event e2 = new Event(toDate("07/11/2017", "12:00"));

		// All
		Event e3 = new Event("NW Hacks", toDate("18/03/2017", "07:00"), 600);
		
		// Print events
		e1.printEvent();
		e2.printEvent();
		e3.printEvent();
	}

	public static Date toDate(String date, String time) {
		StringBuilder sb = new StringBuilder(date);
		sb.append(" ").append(time);
		try {
			return ft.parse(sb.toString());
	    } catch (ParseException e) {
	        e.printStackTrace();
	    }
	    return null;
	}
}
