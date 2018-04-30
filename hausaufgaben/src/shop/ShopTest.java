package shop;

public class ShopTest{



	public static void main(String[] args) {
		
		Shop edeka = new Shop(10);
		
		
		Product a = new Product("Döner", 10);
		Product b = new Product("Dei Mamma", 10);
		Product c = new Product("Blub", 10);
		Product d = new Product("MuschiProduct", 10);
		Product e = new Product("Uli", 10);
		
		edeka.add(a);
		edeka.add(b);
		edeka.add(c);
		edeka.add(d);
		edeka.add(e);
		
		
		edeka.sell(1, a.getName());
		edeka.sell(1, b.getName());
		edeka.sell(1, c.getName());
		edeka.sell(1, d.getName());
		edeka.sell(1, e.getName());
		
		System.out.println(edeka.getRevenue());

		
	}

}
