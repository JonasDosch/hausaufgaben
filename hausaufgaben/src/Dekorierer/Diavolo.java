package Dekorierer;

public class Diavolo extends Topping {

	public Diavolo(Pizza diavolo) {
		super(diavolo);
		
	}

	@Override
	public double getPrice() {
		
		return base.getPrice() + 3.01;
	}

}
