package hausaufgaben;

public class Wrapper {

	public static void main(String[] args) {
		
		Integer i = 99;
		//i.byteValue();
		
		System.out.println(i.byteValue());
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		int j = Integer.parseInt("42");
		System.out.println(j);
		
		Double f = null;
		double g = f;
		System.out.println(g);
	}

}
