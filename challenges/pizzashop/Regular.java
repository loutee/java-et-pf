package pizzashop;
import java.util.*;

public class Regular extends Pizza {

	public Regular(int size, String type, ArrayList toppings, double cost) {
		super(size, type, toppings, cost);
	}

	public void addTopping(String topping) {
		if (toppings.size() <= 5) {
			toppings.add(topping);
		} else {
			System.out.println("The maximum number of toppings has been reached");
		}
	}

	public double calculateCost() {
		return size + 2*toppings.size();
	}

}
