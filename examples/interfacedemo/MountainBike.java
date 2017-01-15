package interfacedemo;

public class MountainBike implements Bicycle {

	int pedalRate = 0;
	int speed = 0;
	int gear = 1;

	@Override
	public void changePedalRate(int newValue) {
		pedalRate = newValue;
	}

	@Override
	public void changeGear(int newValue) {
		gear = newValue;
	}

	@Override
	public void speedUp(int increment) {
		speed += increment;
	}

	@Override
	public void applyBrakes(int decrement) {
		speed -= decrement;
	}

	void printStates() {
		System.out.println(" pedal rate: " + pedalRate + " speed: " +
				speed + " gear: " + gear);
	}

}
