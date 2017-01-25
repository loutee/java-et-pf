

public class FindingPI {

	public static void main(String[] args) {

		System.out.println(getPI(10000));
		System.out.println(getPI(100000));
		System.out.println(getPI(1000000));
		System.out.println(getPI(10000000));
		System.out.println(getPI(100000000));
		System.out.println(getPI(999999999));

	}

	public static double getPI(int numPoints) {
		int inCircle = 0;
		for(int i=0; i < numPoints; i++) {

			double randX = (Math.random() * 2) - 1;
			double randY = (Math.random() * 2) - 1;

			double dist = Math.sqrt(randX * randX + randY * randY);
			if (dist < 1) {
				inCircle++;
			}
		}
		return 4.0 * inCircle / numPoints;
	}

}
