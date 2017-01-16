package pizzashop;

public abstract class Pizza implements Comparable {

	private int size;
	private String type;
	private ArrayList toppings;
	private double cost;

	public Pizza(int size, String type, ArrayList toppings, double cost) {
		this.size = size;
		this.type = type;
		this.toppings = toppings;
		this.cost = cost;
	}

	@Override
	public int compareTo(Object p) {

	}

}
