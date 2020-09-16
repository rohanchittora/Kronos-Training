package q1;

class Circle {
	private double radius;
	private String color;
	{
		this.radius = 1.0;
		this.color = "red";
	}

	public Circle() {
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return this.radius;
	}

	public double getArea() {
		return 3.14 * this.radius * this.radius;
	}
}

public class Cir {
	public static void main(String[] args) {
		Circle c = new Circle(3.0);
		System.out.println("Radius of circle: " + c.getRadius());
		System.out.println("Area of circle: " + String.format("%.2f", c.getArea()));
	}
}