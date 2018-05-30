package Frima;

public class Employee {
	
	private String firstName;
	private String lastName;
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public Employee(String f, String l) {
		this.firstName = f;
		this.lastName = l;
	}
	
	@Override
	public String toString(){
		
		return this.firstName + " " + this.lastName;
	}

}
