/*
 *	Challenge Objectives
 *		Use Monte Carlo Simulation
 *		Estimate probability of:
 *			Getting three same colour marbles
 *			Out of a bowl with 3 blue and 3 white
 *
 *		Algorithm:
 *			Create unique variables for blue/white
 *			Add variables to count attempts/success
 *			Loop simulation
 *			Create an array to simulate the bowl
 *			Create an array to hold marbles selected
 *			Create a loop to draw three
 *			Inside, randomly choose one
 *			Add it to drawn array
 *			Reduce the size of the bowl by one
 *			Update bowl without the selected marble
 *			Test for three matches
 *			Add to success if match...
 *			Calculate success rate
 *			Return value to main
 */

public class MonteCarlo {

	public static void main(String[] args) {
		
		System.out.println("Probability of drawing 3 marbles of the same colour:");
		System.out.println("100 trials: " + marbleSim(100));
		System.out.println("100 trials: " + marbleSim(1000));
		System.out.println("100 trials: " + marbleSim(10000));

	}

	public static String marbleSim(int trials) {

		final int B = 1;
		final int W = 2;
		
		double number = 0.0;
		double result = 0.0;

		for (int t=0; t<trials; t++) {
			
			result++;

			int[] bowl = { B, B, B, W, W, W };
			int[] drawMarbles = new int[3];

			for (int draw = 0; draw < 3; draw++) {

				int index = (int) (Math.random() * bowl.length);
				drawMarbles[draw] = bowl[index];
				int[] newBowl = new int[bowl.length - 1];
				int j = 0;

				for (int i=0; i<bowl.length; i++) {
					if (i == index) {
						continue;
					}
					newBowl[j] = bowl[i];
					j++;
				}
				bowl = newBowl;
			}
			
			if (drawMarbles[0] == drawMarbles[1] && drawMarbles[1] == drawMarbles[2]) {
				number++;
				// System.out.println("winner");
			}
			//System.out.println(Arrays.toString(drawMarbles));
		}

		return "Results: " + (number / result);

	}
		

}
