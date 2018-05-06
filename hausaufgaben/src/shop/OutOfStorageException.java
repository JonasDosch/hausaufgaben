package shop;
import java.io.IOException;

public class OutOfStorageException extends StorageException {
	
	public OutOfStorageException() {
		
	}
	
	
	OutOfStorageException(String s){
		super(s);
	}
}
