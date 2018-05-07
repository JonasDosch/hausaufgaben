package addresses;



public class Address {

	String street;
	String zipCode;
	String city;
	String country;
	
	public Address(String s, String z, String c, String co) {
	
		SetStreet(s);
		SetZipCode(z);
		SetCity(c);
		SetCountry(co);
	
	}
	
	public String GetStreet() {
		return street;
	}
	
	public String GetZipCode() {
		return zipCode;
	}
	
	public String GetCity() {
		return city;
	}
	
	public String GetCountry() {
		return country;
	}
	
	private void SetStreet(String s) throws IllegalArgumentException{
		
		boolean right = false;
		String prüfen;
		int prüfenInt;
		String Array [] = s.split(" ");
		 
		try {
		if(!right) {
			prüfen = Array[0];
			prüfenInt = Integer.parseInt(Array[1]);
			right = true;
		}
		}catch(IllegalArgumentException ex ) {
			throw new IllegalArgumentException
			("Das geht nicht! Street");
		}
				
		if(right) {
			street = s;
		}
		}
	
	private void SetZipCode(String s) throws IllegalArgumentException{
		
		boolean right = false;
		int b;
		
	try {
			b=Integer.parseInt(s);
			right = true;
	}catch (NumberFormatException ex) {
		throw new IllegalArgumentException
		("Das geht nicht! PLZ");
	}
		
		if(right) {
			zipCode = s;
		}		
		
		
		}
	
	private void SetCountry(String s) throws IllegalArgumentException{
		
		if(s == null){
			throw new IllegalArgumentException
			("Das geht nicht!");
		}
		else {
		country = s;	
		}
		}
	
	private void SetCity(String s) throws IllegalArgumentException{
		
		if(s == null){
			throw new IllegalArgumentException
			("Das geht nicht!");
		}
		else {
		city = s;	
		}
		}
	
	public String toString(){
			return street +", "+ zipCode + " " + city + ", " + country;
	}
	
	@Override
	public boolean equals(Object obj){
	
		return (this.GetStreet().equals(((Address) obj).GetStreet()) && this.GetCity().equals(((Address) obj).GetCity()) && this.GetCountry().equals(((Address) obj).GetCountry()) && this.GetZipCode().equals(((Address) obj).GetZipCode()) );
		
	}
}
