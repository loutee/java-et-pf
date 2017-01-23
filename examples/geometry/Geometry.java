package geometry;

// Create JAR with $ jar cvfm <name>.jar manifest.txt *
// Where manifest txt contains:
// 		Main-Class: Geometry
//
// 		*** Note: new line is required

public class Geometry {

	public static void main(String[] args) {
		Shape coin = new Circle("Coin");
		System.out.println("The area for the coin is: " + coin.calculateArea());
		Shape square = new Rectangle();
		System.out.println("The area of the square is: " + square.calculateArea());
		Shape triangle = new Triangle("Pyramid");
		System.out.println("The area of the pyramid is " + triangle.calculateArea());

	}
}
