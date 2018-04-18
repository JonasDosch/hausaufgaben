package hausaufgaben;

public class ShapesPrintTest {

	public static void main(String[] args) {
		
		Shape[] a = new Shape[5];
		a[0] = new Shape(0, 0);
		a[1] = new Point(0, 0);
		a[2] = new Circle(0, 0, 0);
		a[3] = new Rectangle(0, 0, 0, 0);
		a[4] = null;
		
		
		
	
	
		for(int i = 0; i < a.length; i++) {
	
			if(a[i].equals(a[1])) {
				System.out.println(".");
				
			}
			else if(a[i].equals(a[2])) {
				System.out.println("()");
			}
			
			else if(a[i].equals(a[3])) {
				System.out.println("[_]");
			}
			else {
				System.out.println("???");
			}
		}
		

	}
	
}
