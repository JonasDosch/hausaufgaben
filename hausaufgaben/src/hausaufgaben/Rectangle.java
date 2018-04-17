package hausaufgaben;

public class Rectangle extends Shape{
	
	private double width;
	private double heigth;
	
	
	public Rectangle(double x, double y, double width, double heigth) {
		super(x, y);
		this.heigth = heigth;
		this.width = width;
	}
			

	

	double getWidth() {
		return width;
	}

	double getHeigth() {
		return heigth;
	}
	
	
}

