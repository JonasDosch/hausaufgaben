package list;


public class ArrayList<E> implements List<E>{

	E[] myArray;
	private int nextIndex = 0;
	private int capacity = nextIndex;
	
	public ArrayList(int capacity){
		E[] myArray = (E[]) new Object[capacity];
			}
	
	@Override
	public void add(E element) {
		++nextIndex;
		for(int i = 0; i < myArray.length ; i++) {
			
			if(myArray[i] == null) {
				 myArray[i] = (E) element;
			}
		}
	}

	@Override
	public E get(int index) {
	return myArray[index];
	
	}
	
	@Override
	 public void set(int index,E element) {
		if(index>=nextIndex) {
			nextIndex=nextIndex+1;
		}
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
