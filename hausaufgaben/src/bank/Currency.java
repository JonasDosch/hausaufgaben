package bank;

enum Currency{
	EUR(1.00), 
	USD(0.81), 
	CYN(0.13);

	double conversionRateEuro;
	


Currency(double conversionRateEuro) {
	this.conversionRateEuro = conversionRateEuro;
}

double getRate(){
	return this.conversionRateEuro;
}
}