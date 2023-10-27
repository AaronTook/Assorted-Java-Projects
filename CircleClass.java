/* Programming Assignment | Circle class */ 
public class CircleClass {

	public static void main(String[] args) {
		Circle c1 = new Circle(2, 5, 5);
		System.out.println("Area of C1: " + c1.getArea());
		System.out.println("Perimeter of C1: " + c1.getPerimeter());
		System.out.println("C1.contains(3, 3): " + c1.contains(3, 3));
		System.out.println("C1.contains(new Circle(4, 5, 10.5)): " + c1.contains(new Circle(4, 5, 10.5)));
		System.out.println("C1.overlaps(new Circle(3, 5, 2.3)): " + c1.overlaps(new Circle(3, 5, 2.3)));
		
	}

}
class Circle {
	/* Create the private local variables*/ 
	private double x, y;
	private double radius;
	
	/* Constructors */
	Circle() {
		/* A no-arg constructor */
		x = 0;
		y = 0;
		radius = 1;
	}
	Circle(double newX, double newY, double newRadius) {
		/* A constructor using three passed arguments */
		x = newX;
		y = newY;
		radius = newRadius;
	}
	
	/* Getters */
	double getX(){
		/* Return the x-coordinate of the object's center */
		return x;
	}
	double getY() {
		/* Return the y-coordinate of the object's center */
		return y;
	}
	double getRadius() {
		/* Return the radius of the object */
		return radius;
	}
	double getArea() {
		/* Return the area of the object */
		return (Math.PI * Math.pow(radius, 2));
	}
	double getPerimeter() {
		/* Return the perimeter of the object */
		return (Math.PI * radius *2);
	}
	boolean contains(double x_point, double y_point) {
		/* Test whether or not the object contains the point provided as an argument using the object's center and radius */
		double xFromCenter = Math.abs(x-x_point);
		double yFromCenter = Math.abs(y-y_point);
		double distFromCenter = (Math.sqrt(Math.pow(xFromCenter,2)+Math.pow(yFromCenter,2)));
		return distFromCenter <= radius;
	}
	boolean contains(Circle otherCircle) {
		/* Test whether or not the object contains the circle provided as an argument using their centers and radii */
		double otherRadius = otherCircle.getRadius();
		double otherX = otherCircle.getX();
		double otherY = otherCircle.getY();
		return (((otherRadius+otherY <= radius + y) && (otherY-otherRadius >= y - radius)) && ((otherRadius+otherX <= radius + x) && (otherX-otherRadius >= x - radius)));
	}
	boolean overlaps(Circle otherCircle) {
		/* Test whether or not the object and the circle provided as an argument overlap using their centers and radii */
		double otherRadius = otherCircle.getRadius();
		double otherX = otherCircle.getX();
		double otherY = otherCircle.getY();
		double distX = Math.abs(x-otherX);
		double distY = Math.abs(y-otherY);
		double dist = (Math.sqrt(Math.pow(distX,2)+Math.pow(distY,2)));
		return (dist < radius + otherRadius);
	}
	
}