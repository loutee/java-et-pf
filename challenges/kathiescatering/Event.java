/*
 * Event Class
 */

package kathiescatering;

import java.util.*;
import java.text.*;

public class Event implements Comparable {

	private static	SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");

	// Instance data
	private String eventName;
	private Date eventDate;
	private int guestNumber;
	
	// Constructors

	// Event name only
	public Event(String eventName) {
		this.eventName = eventName;
	}

	// Date and time only
	public Event(Date eventDate) {
		this.eventDate = eventDate;
	}

	// All fields known
	public Event(String eventName, Date eventDate, int guestNumber) {
		this.eventName = eventName;
		this.eventDate = eventDate;
		this.guestNumber = guestNumber;
	}

	// Accessor Methods
	public String getName() {
	   return eventName;
	}

	public Date getDate() {
		return eventDate;
	}

	public int getGuests() {
		return guestNumber;
	}

	// Mutator Methods
	public void setName(String name) {
		eventName = name;
	}

	public void setDate(Date date) {
		eventDate = date;
	}

	public void guestNumber(int number) {
		guestNumber = number;
	}

	// Print Method
	public void printEvent() {
		if(eventDate == null) {
			System.out.println("Event: " + eventName + "\n");
		} else if (eventName == null) {
			System.out.println("Date and time: " + df.format(eventDate) + "\n");
		} else {
			System.out.print("Event: " + eventName + "\n" +
							 "Date and time: " + df.format(eventDate) + "\n" +
							 "Number of guests: " + guestNumber + "\n\n");
		}
	}

	// Comparator
	@Override
	public int compareTo(Object e) {
		Event eve = (Event)e;
		if (this.eventDate.after(eve.eventDate)) {
			return 1;
		} else if (this.eventDate.equals(eve.eventDate)) {
			return 0;
		} else {
			return -1;
		}
	}
}
