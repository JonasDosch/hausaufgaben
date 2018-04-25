package bank;
import java.util.*;
public class SortTest extends Account implements Printable{

	public SortTest(int i, String a, int j) {
		super(i, a, j);
		
	}


	public static void main(String[] args) {
		
		Account[] a = {
		 new SortTest(923, "B" , 4),
		 new SortTest(734, "C", 5),
		 new SortTest(345, "D", 6),
		 new SortTest(156, "E", 7)
		};
		
	
		
		Arrays.sort(a);
		for(int i = 0; i <= a.length; i++) {
			try {
			a[i].print();
			}catch(Exception ex) {}
		}
		}
	

	@Override 
	public int compareTo(Object obj) {
		if (obj instanceof Account) {
			Account other = (Account) obj;
			if (this.GetId() < other.GetId()) {
				return -1;
			} else if (this.GetId() > other.GetId()) {
				return 1;
			} else {
				return 0;
			}
		} else {
			System.out.println("Fehler: ungültiger Vergleich");
			return -1;
		}




}



}
