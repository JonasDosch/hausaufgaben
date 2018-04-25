package bank;

 class SavingsAccount extends Account implements InterestBearing {
	
	
	double interestRate;
	
	public SavingsAccount(int i, String a, int j, double z) {
		super(i,a,j);
		interestRate = z;
	}


	public double getInterestRate() {
		
		return interestRate;
	}

	
	public void accrueInterest() {
		int interest = (int) Math.round(GetBalance()*this.interestRate);
		
		this.balance = this.balance + interest;
		
	}
	
	public void print() {
		System.out.println("accountnumer: \t" + "\t" + this.id + "\n" + "depositor: \t" + "\t" + this.depositor + "\n" + "current balance: \t" + this.balance + "EUR" + "\n" + "interest Rate: \t" + "\t" + this.interestRate);

	}


	@Override
	public int compareTo(Object a, Object b) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
