package addresses;

public class AddressTest{
	

	public static void main(String[] args) {
		
		
		Address a = new Address("Schculstra�e 2", "86438", "Kissing", "Deutschland");
		Address b = new Address("Schculstra�e 2", "86438", "Kissing", "Deutschland");
		boolean c = a.equals(b);
		System.out.println(c);
		System.out.println(a);
		
}
		
	

	}


