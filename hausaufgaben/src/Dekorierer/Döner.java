package Dekorierer;

public class D�ner  extends Topping {

	public D�ner(Pizza d�ner) {
		super(d�ner);
		
	}

	@Override
	public double getPrice() {
		
		return base.getPrice() + 74000.01;
	}

}
