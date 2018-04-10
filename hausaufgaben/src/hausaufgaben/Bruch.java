package hausaufgaben;
//import static jsTools.Input.*;

public class Bruch {
	
	int zaehler;
	int nenner;
	
	public String toString() {
		return zaehler+"/"+nenner;
	}
	
	public static void main(String []args) {
		
		Bruch a =  new Bruch();
		a.SetBruch(4,16);
		
		Bruch b = new Bruch();
		b.SetBruch(2, 4);
		
		
		System.out.println(a.groessterTeiler(a.zaehler,a.nenner));
		
		System.out.println(a.kuerzen());
		
		System.out.println(a.mul(3));
		
		System.out.println(a.mul(a));
		
		System.out.println(a.add(b));
	}
	public void SetBruch(int zaehler, int nenner) {
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
	
	public Bruch kuerzen() {
		int neuerBruch = this.groessterTeiler(this.zaehler, this.nenner);
		
		Bruch kurz = new Bruch();
		kurz.zaehler = zaehler/neuerBruch;
		kurz.nenner = nenner/neuerBruch;
		
		return kurz;
		
		
	}
	public Bruch mul(int z) {
		
		Bruch mul = new Bruch();
		mul.zaehler= zaehler *z;
		mul.nenner= nenner;
		return mul;
	}
	
	public Bruch mul(Bruch bruch) {
		Bruch mul2 = new Bruch();
		mul2.zaehler=this.zaehler*bruch.zaehler;
		mul2.nenner=this.nenner*bruch.nenner;
		
		return mul2.kuerzen();
		
		
		
	}
	
	public Bruch add(Bruch bruch) {
		Bruch add = new Bruch();
		this.zaehler = this.zaehler * bruch.nenner;
		bruch.zaehler = bruch.zaehler * this.nenner;
		add.nenner = this.nenner * bruch.nenner;		
		add.zaehler = this.zaehler + bruch.zaehler;
		
		return add.kuerzen();
		
		
		
	}
}