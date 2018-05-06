package shop;
import java.io.IOException;

public class OutOfStockException extends StorageException {
	
	public OutOfStockException() {
		
	}
	
	OutOfStockException(String s){
		super(s);
	}

}
