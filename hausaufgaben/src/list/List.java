package list;

public interface List<E> {
	
	void add(E element);
	
	E get(int index);
	
	void set (int index, E element);
	
	int size();

}
