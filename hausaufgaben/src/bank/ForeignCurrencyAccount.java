package bank;

public class ForeignCurrencyAccount extends Account {
	
	Currency currency;
	
	public ForeignCurrencyAccount(int i, String a, int j, Currency p) {
		super(i,a,j);
		currency = p;
	}
	
	public void print() {

		System.out.println("accountnumer: \t" + "\t" + this.id + "\n" + "depositor: \t" + "\t" + this.depositor + "\n" + "current balance: \t" + (double) (this.balance * currency.conversionRateEuro)/100 + " " +currency );

		
		
		
}

	
}
