package pizzashop;
import java.util.*;

public class Regular extends Pizza {

	public Regular(int size) {
		super(size, "Regular");
	}

	public void addTopping(String topping) {
		if (toppings.size() <= 5) {
			toppings.add(topping);
		} else {
			System.out.println("The maximum number of toppings has been reached");
		}
	}

	public double calculateCost() {
		cost = size + 2*toppings.size();
		return cost;
	}

}
