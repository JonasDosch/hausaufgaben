package bank;

public abstract class Account implements Printable, Comparable{
	
	int id;
	String depositor;
	int balance;

	
	public Account(int i, String a, int j) {
		id = i;
		depositor = a;
		balance = j;
	}
	
	public int GetId() {
		return id;
	}
	
	public String GetDepositor() {
		return depositor;
	}
	
	public int GetBalance() {
		return balance;
	}
	
	void deposit(int amount) {
		this.balance = this.balance + amount;
	}
	
	void withdraw(int amount) {
		this.balance = this.balance - amount;
	}
	
	@Override
	public boolean equals(Object obj){
		Account account = (Account)obj;
		return this.GetId() == account.GetId();
		
	}
	


	


	public void print() {

		System.out.println("accountnumer: \t" + "\t" + this.id + "\n" + "depositor: \t" + "\t" + this.depositor + "\n" + "current balance: \t" + this.balance + " EUR");
	
}
	


	@Override
	public int compareTo(Object obj) {
		if (obj instanceof Account) {
			Account other = (Account) obj;
			if (this.GetId() < other.GetId()) {
				return -1;
			} else if (this.GetId() > other.GetId()) {
				return 1;
			} else {
				return 0;
			}
		} else {
			System.out.println("Fehler: ungültiger Vergleich");
			return -1;
		}
	}


}
