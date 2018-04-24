package bank;

public class EqualsTest {

	public static void main(String[] args) {
		
		Account a = new Account(123, "Pedda", 1000);
		Account b = new Account(123, "Pedda", 1000);
		
		if(a.equals(b)) {
			System.out.println("Richtig");
		}else {System.out.println("Nope");

	}

}
}
