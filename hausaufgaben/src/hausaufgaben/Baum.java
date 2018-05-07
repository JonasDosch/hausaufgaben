package hausaufgaben;
import static jsTools.Input.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import addresses.mehr;

public class Baum {
	
	int zaehler;
	int nenner;
	
	public String toString() {
		return zaehler+"/"+nenner;
	}
	
	public static void main(String []args) {
		
		String s = "Schulstraße 2";
		
		Pattern pattern = Pattern.compile("(\\w+)\\s(\\d+)"); 
				Matcher matcher = pattern.matcher(s);
					 if(matcher.find()){
					    System.out.println(matcher.group(1)); 
					    System.out.println(matcher.group(2)); 
					    }
			
		System.out.println(s);
		
		
		Baum a =  new Baum();
		a.SetBaum(4,16);
		
		
		System.out.println(a.groessterTeiler(a.zaehler,a.nenner));
		
		System.out.println(a.kuerzen());
		
		System.out.println(a.mul(3));
		
		System.out.println(a.mul(a));

}
	
	
			 
			 
	public void SetBaum(int zaehler, int nenner) {
		this.zaehler = zaehler;
		this.nenner = nenner;
	}
	static int groessterTeiler(int zahl1, int zahl2) {
		int r = zahl1 % zahl2;
		
		if(r==0) {
			return zahl2;
		}
		else {
			return groessterTeiler(zahl2, r);
		}
	}
	
	public Baum kuerzen() {
		int neuerBruch = this.groessterTeiler(this.zaehler, this.nenner);
		
		Baum kurz = new Baum();
		kurz.zaehler = zaehler/neuerBruch;
		kurz.nenner = nenner/neuerBruch;
		
		return kurz;
		
		
	}
	public Baum mul(int z) {
		
		Baum mul = new Baum();
		mul.zaehler= zaehler *z;
		mul.nenner= nenner;
		return mul;
	}
	
	public Baum mul(Baum baum) {
		Baum mul2 = new Baum(this.zaehler*baum.zaehler, this.nenner*baum.nenner);
		return mul2.kuerzen();
		
		
		
	}
	
	public Baum add(Baum baum) {
		Baum add = new Baum();
		this.zaehler = this.zaehler * baum.nenner;
		baum.zaehler = baum.zaehler * this.nenner;
		add.nenner = this.nenner * baum.nenner;		
		add.nenner = this.zaehler + baum.zaehler;
		
		return add.kuerzen();
		
		
		
	}
}