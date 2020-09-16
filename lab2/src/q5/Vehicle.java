package q5;

public class Vehicle {
	protected int noOfWheel;
	protected int noOfPassenger;
	protected int model;
	protected String make;

	public Vehicle(int noOfWheel, int noOfPassenger, int model, String make) {
		this.noOfWheel = noOfWheel;
		this.noOfPassenger = noOfPassenger;
		this.model = model;
		this.make = make;
	}

	public int getNoOfWheel() {
		return noOfWheel;
	}

	public void setNoOfWheel(int noOfWheel) {
		this.noOfWheel = noOfWheel;
	}

	public int getNoOfPassenger() {
		return noOfPassenger;
	}

	public void setNoOfPassenger(int noOfPassenger) {
		this.noOfPassenger = noOfPassenger;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public void display() {
		System.out.println("Make : " + make);
		System.out.println("Model : " + model);
		System.out.println("No. of wheel : " + noOfWheel);
		System.out.println("No. of passenger :  " + noOfPassenger);
	}
}
