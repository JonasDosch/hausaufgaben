package bank;

public class EqualsTest {

	public static void main(String[] args) {
		
		Account a = new SavingsAccount(123, "Pedda", 1000, 2.99);
		Account b = new SavingsAccount(123, "Pedda", 1000, 2.99);
		
		if(a.equals(b)) {
			System.out.println("Richtig");
		}else {System.out.println("Nope");

	}

}
}
