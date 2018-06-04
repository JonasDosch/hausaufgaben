package Dekorierer;

public abstract class Topping implements Pizza{
	
	protected Pizza base;
	
	public Topping(Pizza b) {
		this.base = b;
	}

}
