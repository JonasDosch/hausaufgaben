package Dekorierer;

public class PizzaTest {

	public static void main(String[] args) {
		
		Pizza First = new Döner(new PizzaCrust());
		System.out.println(First.getPrice());
		
		Pizza Second = new Diavolo(new PizzaCrust());
		System.out.println(Second.getPrice());
		
		Pizza Third = new Marmelade(new PizzaCrust());
		System.out.println(Third.getPrice());
		
		

	}

}
