package Dekorierer;

public class Döner  extends Topping {

	public Döner(Pizza döner) {
		super(döner);
		
	}

	@Override
	public double getPrice() {
		
		return base.getPrice() + 74000.01;
	}

}
