package hausaufgaben;

public class Circle extends Shape{
	
	private double radius;
	
	public Circle(double x, double y, double radius1) {
		
		super(x, y);
		radius = radius1;
	}
	
	
	double getRadius() {
		return radius;
	}
	
1
}
