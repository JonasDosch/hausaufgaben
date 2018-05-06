package shop;

public class ShopTest{



	public static void main(String[] args) {
		
		Shop edeka = new Shop(10);
		
		
		Product a = new Product("Döner", 10);
		Product b = new Product("M", 10);
		Product c = new Product("B", 10);
		Product d = new Product("MuschiProduct", 10);
		Product e = new Product("Uli", 10);
		
		try {
		edeka.add(a);
		edeka.add(b);
		edeka.add(c);
		edeka.add(d);
		edeka.add(e);
		}catch(OutOfStorageException ex) {}
		
		try {
		edeka.sell(edeka.count(a.getName()), a.getName());
		edeka.sell(edeka.count(b.getName()), b.getName());
		edeka.sell(edeka.count(c.getName()), c.getName());
		edeka.sell(edeka.count(d.getName()), d.getName());
		edeka.sell(edeka.count(e.getName()), e.getName());
		} catch (OutOfStockException ex) {}

		
		System.out.println(edeka.getRevenue());

		
	}

}
