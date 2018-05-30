package Telefonbuch;

public interface Dictionary<K, V> extends Iterable<K>{

	public void put(K key, V value);
	
	public V get(K key);
	
	public boolean containsKey(K key);
}
