package Telefonbuch;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class LinearDictionary<K , V> implements Dictionary<K, V>{
	
	private final List<Pair<K, V>> entries;
	
	public LinearDictionary() {
	 entries = new ArrayList<>();
	}
	
	private static class Pair<K , V>{
		
		private final K key;
		private final V value;
		
		public Pair(K k, V v) {
			key = k;
			value = v;
		}
		
		public K GetKey() {
			return key;
		}
		
		public V GetValue() {
			return value;
		}
		
	}

	  private Pair<K, V> findEntry(K key) {
	        for (Pair<K, V> key1 : entries) {
	            if (key1.GetKey().equals(key)) {
	                return key1;
	            }
	        }
	        return null;
	    }

	@Override
	public void put(K key, V value) {
		Pair<K,V> Test = findEntry(key);
		if(Test != null) {
			entries.remove(Test);
						
		}
		entries.add(new Pair<K,V>(key, value));
		
		
	}

	@Override
	public V get(K key) {
		
		Pair<K,V> Test = findEntry(key);
		
		if(Test!=null) {
			return Test.GetValue();
		}
		return null;
	}

	@Override
	public boolean containsKey(K key) {
		Pair<K,V> Test = findEntry(key);
		boolean a = false;
		if(Test != null) {
			a=true;
			return a;
		}
		return a;
	}
	
    private class DictIterator implements Iterator<K> {
    	
        private Iterator<Pair<K, V>> iterator;

        public DictIterator() {
            iterator = entries.iterator();
        }
        @Override
        public boolean hasNext() {
            return iterator.hasNext();
        }
        @Override
        public K next() {
            Pair<K, V> Test = iterator.next();
            return Test.GetKey();
        }
    }
    
    public Iterator<K> iterator() {
        Iterator<K> a =  new DictIterator();
        return a;
    }


		


}
