package JSample;

public class JSample13_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle circle = new Circle();
		double area = circle.getAreaOfCircle(2.0);
		System.out.println(area);

	}
}

class Circle {
	final double PI = 3.14159;

	final double getAreaOfCircle(double radius) {
		return PI * radius * radius;
	}
}
