package list;

public class ListTest{


	public static void main(String[] args) {
		
		ArrayList<String> myArray = new ArrayList<>(4);
				
		myArray.add("Fick Dich");
		myArray.set(1, "Hurensohn");
		myArray.add("Penis");
		
		System.out.println(myArray.size());
		System.out.println(myArray.get(1));
	
		
	}

}
