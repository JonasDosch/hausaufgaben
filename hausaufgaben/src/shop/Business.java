package shop;

public interface Business {
	
	void sell(int quantity, String productName) throws OutOfStockException;
	
	double getRevenue();

}
