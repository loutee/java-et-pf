package pizzashop;
import java.util.*;

public abstract class Pizza implements Comparable {

	private static final int small_diameter = 12;
	private static final int med_diameter = 14;
	private static final int lg_diameter = 16;
	private static final int xlg_diameter = 18;

	public double[] price = {10.00, 12.00, 14.00, 16.00};
	public double cost;
	public String type;
	public ArrayList<String> toppings = new ArrayList<String>();
	int size;

	public Pizza() {
		type = "pizza";
	}

	public Pizza(int size) {

		switch(size) {
			case small_diameter:
				cost = price[0];
				size = small_diameter;
				break;
			case med_diameter:
				cost = price[1];
				size = med_diameter;
				break;
			case lg_diameter:
				cost = price[2];
				size = xlg_diameter;
				break;
		}

	}

	public abstract void getToppings();

	@Override
	public int compareTo(Object p) {
		Pizza other = (Pizza)p;
		if (other.size > this.size) {
			return 1;
		} else if (other.size == this.size) {
			return 0;
		} else {
			return -1;
		}
	}

	public void printString() {
		String topping="";
		if (toppings.size() == 0) {
			topping = "No toppings selected.";
		} else {
			for(int i = 0; i < toppings.size(); i++) {
				topping += toppings.get(i) + ", ";
			}
		}
		System.out.println("Your pizza has been ordered with: " +
							topping + ".\nThe total cost is $" + cost);
	}

}
