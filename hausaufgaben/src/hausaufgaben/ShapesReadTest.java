package hausaufgaben;
import static jsTools.Graph.*;
import static jsTools.Input.*;



public class ShapesReadTest {



	public static void main(String[] args) {
		double PI = Math.PI;
		int x = 10;
		int y = 10;

/*		java.util.Scanner scanner = new java.util.Scanner(System.in);
		double p = Double.parseDouble(scanner.nextLine());
		*/
		
		for(int w = 1; w < 2; w++) {
			
			w--;
			
		String a = readString("Geben Sie für ein Rechteck ´R´ ein und für einen Kreis ´C´ an!? Wenn Sie keinen Bock mehr haben geben Sie ´x´ an!");
		
		if(a.equals("R")){
			double i = readDouble("Welche Höhe hat das Rechteck?");
			double j = readDouble("Welche Breite hat das Rechteck?");
			
			System.out.println("Die Fläche Ihres Rechtecks ist: " + i*j);
			
			int g = (int) i;
			int f = (int) j;
				
			addRect(x,y,f,g,blue);
			
			
		}
		else if(a.equals("C")) {
	
			double r = readDouble("Welchen Radius soll der Kreis haben?");
			
			System.out.println("Die Fläche Ihres Kreises ist: " + r*r*PI);
			
			int ra = (int) r;
			
			addCircle(x,y,2*ra,yellow);
			
		}
		
		else if(a.equals("x")) {
			
			System.out.println("Vielen Dank, dass Du mich aus der Endlosschleife befreit hast!");
			break;
		}
		
		else{
			a = readString("Geben Sie für ein Rechteck ´R´ ein und für einen Kreis ´C´!?");
		}

	}
	}

}
