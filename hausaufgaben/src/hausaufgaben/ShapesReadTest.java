package hausaufgaben;
import static jsTools.Input.*;



public class ShapesReadTest {

	public static void main(String[] args) {
		double PI = Math.PI;
		
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		double p = Double.parseDouble(scanner.nextLine());
		
		for(int w = 1; w < 2; w++) {
			
			w--;
			
		String a = readString("Geben Sie f�r ein Rechteck �R� ein und f�r einen Kreis �C� an!?");
		
		if(a.equals("R")){
			double i = readInteger("Welche H�he hat das Rechteck?");
			double j = readInteger("Welche Breite hat das Rechteck?");
			
			System.out.println("Die Fl�che Ihres Rechtecks ist: " + i*j);
			
		//	addRect(10,10,j,i, );
			
			
		}
		else if(a.equals("C")) {
	
			int r = readInteger("Welchen Radius soll der Kreis haben?");
			
			System.out.println("Die Fl�che Ihres Kreises ist: " + r*r*PI);
			
		//	addCircle(10,10,2*r,);
			
		}
		
		else{
			a = readString("Geben Sie f�r ein Rechteck �R� ein und f�r einen Kreis �C�!?");
		}

	}
	}

}
