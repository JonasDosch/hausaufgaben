package list;

public class ListTest{

	public static void main(String[] args) {
		
		Object[] myArray = new String[5];
		
		
		myArray[0] = "Hallo";
		myArray[1] = "Pimmel";
		myArray[2] = "Dödel";
		
		((ArrayList) myArray[3]).add((Object)"Penis");
		
		
		
		
		/*
		 ((ArrayList) myArray[0]).add((Object)"Hallo");
		 ((ArrayList) myArray[1]).add((Object)"Dödel");
		 ((ArrayList) myArray[2]).add((Object)"Pimmel");
		 
		 ((ArrayList) myArray[3]).set(3, (Object) "Baum");
		 
	//	 int i =   myArray.size();
		
		 
		 System.out.println(((ArrayList) myArray[3]).get(3));
		 */
	}

}
