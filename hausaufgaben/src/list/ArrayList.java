package list;


public class ArrayList<E> implements List{

	E[] myArray;
	private int nextIndex = 0;
	
	public ArrayList(int capacity){
		E[] myArray = (E[]) new Object[capacity];
			}
	
	@Override
	public void add(Object element) {
		++nextIndex;
		for(int i = 0; i < myArray.length ; i++) {
			if((E) myArray[i] == null) {
				 myArray[i] = (E) element;
			}
		}
		
	}

	@Override
	public Object get(int index) {
	return (E) myArray[index];
	
	}

	@Override
	public void set(int index, Object element) {
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
