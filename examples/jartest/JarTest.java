/*
 * Compile with $ javac -cp MyGeometry.jar JarTest.java
 * Run with $ java -cp MyGeometry.jar:. JarTest
 */

import geometry.*;

public class JarTest {

	public static void main(String[] args) {

		Shape orange = new Circle("circle");
		double area = orange.calculateArea();
		System.out.println("The area for the circle is: " + area);
		Shape square = new Rectangle("Square");
		double area2 = square.calculateArea();
		System.out.println("The area for the square is: " + area2);
	}

}
