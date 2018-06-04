package Dekorierer;

public class Marmelade extends Topping {

	public Marmelade(Pizza marmelade) {
		super(marmelade);
		
	}

	@Override
	public double getPrice() {
		
		return base.getPrice() + 4000.01;
	}

}
