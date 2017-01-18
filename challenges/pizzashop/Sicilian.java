package pizzashop;
import java.util.*;

public class Sicilian extends Pizza {

	public Sicilian(int size, String type, ArrayList toppings, double cost) {
		super(size, type, toppings, cost);
	}   

    public void addTopping(String topping) {
		if (toppings.size() <= 2) {
			toppings.add(topping);
		} else {
			System.out.println("The maximum number of toppings has been reached");
		}   

    public double calculateCost() {
	    return 5 + size + 2*toppings.size();
	}  	

}
