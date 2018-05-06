package shop;

import java.io.IOException;

public class Shop implements Storage, Business {
	
	private Product [] storage;
	private double revenue;
	
	public Shop(int capacity) {

		this.storage = new Product [capacity];
	}
	

	int indexOf(Product item) {
		for(int i = 0; i < storage.length; i++ ) {
			
			if(item == storage[i]) {
				return i;
			}else {
				return -1;
			}
		}
		return 0;
	}

	@Override
	public void sell(int quantity, String productName) throws OutOfStockException{

		boolean sold = false;
		
		for(int i = 0 ; i < quantity; i++) {
			Product x = get(productName);
			if(x != null) {
				revenue = revenue + x.getPrice();
				x = null;
				sold=true;
			}
		}
			
			if(!sold) {
				throw new OutOfStockException(
						"Ist bereits verkauft!");
			}
			
			
		
	}

	@Override
	public double getRevenue() {
	
		return revenue;
		
	}

	@Override
	public void add(Product item) throws OutOfStorageException {
		
	boolean isInStorage = false;
	
		for(int i = 0; i < storage.length; i++ ) {
	
			if(storage[i] == null) {
				storage[i] = item;
				isInStorage = true;
				return;
			}
							
			
		}
		
		if(!isInStorage) {
			throw new OutOfStorageException(
					"Kein Platz mehr!");
		}
		
	}

	@Override
	public void remove(Product item) throws StorageException{
		boolean isIn = false;
		for(int i = 0; i < storage.length; i++ ) {
			if(storage[i] == item) {
				storage[i] = null;
				isIn = true;
			}
		}
			
			if(!isIn) {
				throw new StorageException(
						"Ist nicht mehr drin!");
			}
		
		
	}
	
	public void removel(Product item) throws IOException {
		for(int i = 0; i < storage.length; i++ ) {
			if(((Storage) storage[i]).get(storage[i].getName()) == null ) {
				throw new IOException(
						"Produkt nicht im Lager!");
						
			}
			
			if(storage[i] == item) {
				storage[i] = null;
			}
			
		
		}
		
	}

	@Override
	public Product get(String productName) {
		for(int i = 0; i < storage.length; i++ ) {
			if(storage[i].getName().equals(productName)) {
				return  (Product) storage[i];
			}
		}
				return (Product) null;

	}

	@Override
	public int count(String productName) {
		int count = 0;
		for(int i = 0; i<storage.length; i++) {
			if(storage[i] != null) {
			if(storage[i].getName().equals(productName)) {
				count++;
				
			}
			}
		}
		//System.out.print(count);	
		return count;
	}

	@Override
	public int getCapacity() {
		return storage.length;
	}

	@Override
	public int size() {
		int w = 0;
		for(int i = 0; i < storage.length; i++) {
			if(storage[i] != null) {
				w++;
			}else {
				w = w;
			}
		}
		return w;
	}



}
