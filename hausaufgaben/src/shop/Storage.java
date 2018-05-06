package shop;

public interface Storage {
	
	void add(Product item) throws OutOfStorageException;
	
	 void remove(Product item) throws StorageException;
	 
	 Product get(String productName);
	 
	 int count(String productName);
	 
	 int getCapacity();
	 
	 int size();

}
