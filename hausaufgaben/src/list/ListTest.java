package list;

public class ListTest{


	public static <E> void main(String[] args) {
		
		E[] myArray = (E[]) new String[4];
		
		
		myArray[0] = (E) "Hallo";
		myArray[1] = (E) "Pimmel";
		myArray[2] = (E) "Dödel";
		
		
		System.out.println(myArray[3]);
		
		
	}

}
