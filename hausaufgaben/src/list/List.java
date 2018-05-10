package list;

public interface List<E> {
	
	
	public E get(int index);
	
	public void set (int index, E element);
	
	public int size();

	public void add(E element);

}
