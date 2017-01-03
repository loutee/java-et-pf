import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		String prompt = args[0];
		System.out.println(prompt);

		Scanner in = new Scanner(System.in);
		String name = in.nextLine();
		int age = in.nextInt();

		System.out.println("Hello, " + name + ", you are " + age + " years old.");
	}
}
