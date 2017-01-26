import java.util.*;

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
		// Delay each prompt by 1 second
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		countDown(count - 1);
	}

}
