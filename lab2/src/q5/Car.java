package q5;

public class Car extends Vehicle {
    protected int noOfDoor;

	public Car(int noOfWheel, int noOfPassenger, int model, String make, int noOfDoor) {
		super(noOfWheel, noOfPassenger, model, make);
		this.noOfDoor = noOfDoor;
	}

	public int getNoOfDoor() {
		return noOfDoor;
	}

	public void setNoOfDoor(int noOfDoor) {
		this.noOfDoor = noOfDoor;
	}

	public void display() {
		System.out.println("Make = " + this.getMake());
		System.out.println("Model = " + this.getModel());
		System.out.println("No. of door = " + this.getNoOfDoor());
	}
}
