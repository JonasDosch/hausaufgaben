package list;


public class ArrayList<E> implements List{

	E[] myArray;
	
	public ArrayList(int capacity){
		E[] myArray = (E[]) new Object[capacity];
			}
	
	@Override
	public void add(Object element) {
		for(int i = 0; i < myArray.length ; i++) {
			if(myArray[i] == null) {
				myArray[i] = (E) element;
			}
		}
		
	}

	@Override
	public Object get(int index) {
	return myArray[index];
	
	}

	@Override
	public void set(int index, Object element) {
		
		myArray[index] = (E) element;
	}

	@Override
	public int size() {
		int size=0;
		for(int i = 0; i < myArray.length; i++) {
			size = size +1;
		}
		return size;
	}

}
