package bank;

import java.util.Currency;

public class Account implements Printable{
	
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
	
	 void boolean equals(Object obj){
		return this.GetId() == obj.GetId();
		
	}

	


	public void print() {

		System.out.println("accountnumer: \t" + "\t" + this.id + "\n" + "depositor: \t" + "\t" + this.depositor + "\n" + "current balance: \t" + this.balance + " EUR");
	
}
}
