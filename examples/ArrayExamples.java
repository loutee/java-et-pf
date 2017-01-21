
public class ArrayExamples {

	public static void main(String[] args) {
		
		int[] ages = new int[20];
		double[] prices = {5.25, 6.50, 2.30, 10.75};

		double total =	prices[0] +
						prices[1] +
						prices[2] +
						prices[3];

		boolean[] responses = {true, false, false, true, true};
		char[] vowels = {'a', 'e', 'i', 'o', 'u'};
		String[] names = new String[10];
	
		// Enhanced for loop
		// Reads only. Starts from first and goes to last.
		for(double element : prices) {
			System.out.println(element);
		}
		
		for(boolean response : responses) {
			System.out.println(response);
		}
		
	}

}
