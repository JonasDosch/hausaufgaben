package shop;

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
	public void sell(int quantity, String productName) {

		for(int i = 0 ; i < quantity; i++) {
			Product x = get(productName);
			if(x != null) {
				revenue = revenue + x.getPrice();
				x = null;
			}
			
			}
		
	}

	@Override
	public double getRevenue() {
	
		return revenue;
		
	}

	@Override
	public void add(Product item) {
		for(int i = 0; i < storage.length; i++ ) {
			try {
			if(storage[i] == null) {
				storage[i] = item;
				return;
			}
							
			}catch(NullPointerException ex) {}
		}
		
	}

	@Override
	public void remove(Product item) {
		for(int i = 0; i < storage.length; i++ ) {
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
