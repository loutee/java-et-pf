import java.util.Arrays;

public class SampleAPIs {

	public static void main(String[] args) {
		int[] numbers = {5, 3, 17, 25, 4, 33, 45, 12};
		char[] vowels = {'a', 'e', 'i', 'o', 'u'};
		boolean[] responses = {true, false, false, true, true};
		boolean[] responses2 = {false, true, false, true, true};

		System.out.println("Before sorting: " + Arrays.toString(numbers));
		Arrays.sort(numbers);
		//Note, sort uses quicksort for primitive types
		//	but uses mergesort for objects due to stability
		System.out.println("After sorting: " + Arrays.toString(numbers));

		int key = 25;
		//Binary search only works if the array is already sorted
		int keyPosition = Arrays.binarySearch(numbers, key);
		System.out.println("Your key was found in position " + keyPosition);

		if (Arrays.equals(responses, responses2) == true) {
			System.out.println("The two boolean arrays are the same.");	
		} else {
			System.out.println("The two boolean arrays are different.");	
		}

		int[] numbers2 = Arrays.copyOf(numbers, numbers.length*2);

	}

}
