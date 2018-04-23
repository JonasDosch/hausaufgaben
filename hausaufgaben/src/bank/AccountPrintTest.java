package bank;

public class AccountPrintTest {

	public static void main(String[] args) {
		
		Account a = new SavingsAccount(1234, "Bedda", 2345, 2.99 );
		
		a.print();

	}

}
