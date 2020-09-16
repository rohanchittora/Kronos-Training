package q5;

class Convertible extends Car {
	private boolean isHoodOpen;

	public Convertible(int noOfWheel, int noOfPassenger, int model, String make, int noOfDoor, boolean isHoodOpen) {
		super(noOfWheel, noOfPassenger, model, make, noOfDoor);
		this.isHoodOpen = isHoodOpen;
	}

	public boolean isHoodOpen() {
		return isHoodOpen;
	}

	public void setHoodOpen(boolean isHoodOpen) {
		this.isHoodOpen = isHoodOpen;
	}

	public void display() {
		super.display();
		if (isHoodOpen) {
			System.out.println("Hood is open");
		} else {
			System.out.println("Hood is closed");
		}
	}
}
