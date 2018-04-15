package hausaufgaben;
/**
 * Dies ist eine Klasse, die die Funktion von JavaDoc zeigen soll
 * @author Jonas Dosch
 * 
 *
 */
public class JavaDocTest {
	/**Die Konstante Pi.
	 * 
	 */
	private final static double PI = 3.1415926;
	
	public JavaDocTest() {
		
	}
	
	public static double mul(double x) {
		return x*PI;
	}
	public static void main(String[]args) {
	System.out.println(mul(3.23));
}}
