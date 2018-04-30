package shop;

public interface Storage {
	
	void add(Product item);
	
	 void remove(Product item);
	 
	 Product get(String productName);
	 
	 int count(String productName);
	 
	 int getCapacity();
	 
	 int size();

}
