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

	public abstract addTopping();
	public abstract calculateCost();

	@Override
	public int compareTo(Object p) {
		Pizza pizza = (Pizza)p;
		int size1 = Integer.parseInt(this.size);
		int size2 = Integer.parseInt(this.size);
		if (size1 > size2) {
			return 1;
		} else if (size1 == size2) {
			return 0;
		} else {
			return -1;
		}
	}

}
