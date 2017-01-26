

public class RecursionExample {

	public static void main(String[] args) {
		System.out.println("The countdown has begun!");
		countDown(10);
		System.out.println("Blastoff!");
	}

	public static void countDown(int count) {
		if (count <= 0) {
			return;
		}
		System.out.println(count + "...");
		countDown(count - 1);
	}

}
