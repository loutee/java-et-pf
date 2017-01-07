package payroll;

public class Payroll {
	public static void main(String[] args) {
		Address a1 = new Address("123", "South Main Street", "Cleveland", "OH", "12345");
		Address a2 = new Address("123", "North Main Street", "Willoughby", "OH", "54321");
		Employee ee1 = new Employee("Peggy", "Fisher", "717-555-1212", a1, 955123, 003, "Lecturer", 45000.00 );
		ee1.printEmployee();

		Employee ee2 = new Employee("Bob", "Fisher", "717-555-1212", a1, 955123, 003, "Lecturer", 45500.00 );
		ee2.printEmployee();

		ee2.setSalary(66000d);
		ee2.setTitle("Producer");
		ee2.printEmployee();

		// compare salaries to see who makes more money
		if (ee1.compareTo(ee2) == 0) {
			System.out.println("\nEqual salaries");
		} else if (ee1.compareTo(ee2) < 0) {
				System.out.println("\n" + ee2.getName() + " makes more than " + ee1.getName());
		} else {
			System.out.println("\n" + ee1.getName() + " makes more than " + ee2.getName());
		}
		
		System.out.println("Address in sorted order: \n");
		if (a1.compareTo(a2) == 0 || a1.compareTo(a2) < 0) {
			System.out.println(a1);
			System.out.println(a2);
		} else {
			System.out.println(a2);
			System.out.println(a1);
		}
	}
}
