package interfacedemo;

public class InterfaceDemo {

	public static void main(String[] args) {
		MountainBike Huffy = new MountainBike();
		Huffy.printStates();
		//Update Bicycle info
		Huffy.changePedalRate(2);
		Huffy.speedUp(5);
		Huffy.changeGear(1);
		System.out.println("\nAfter updating the info: ");
		Huffy.printStates();
	}

}
