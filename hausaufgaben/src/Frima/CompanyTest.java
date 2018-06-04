package Frima;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class CompanyTest {
    public static void main(String[] args) {

    	Sequence<Integer> employeeIdSequence = new Sequence<Integer>(){
    		private int id = 0;
    		
    		@Override 
    		
    		public Integer next() {
    			id = id +1 ;
    			return id;
    		}
    	};
    	
    	
    	Department a = new Department(employeeIdSequence, "Dei Mudder Abteilung" );
    	Department b = new Department(employeeIdSequence, "Fick Dein Gesicht Abteilung");
    	
    	int c = a.addEmployee("Baum", "Johann");
    	int d = b.addEmployee("Huan", "Sohn");
    	
    	System.out.println(a.getName());
    	for(Employee e : a) {
    		System.out.println(e);
    	}
    	System.out.println(b.getName());
    	for(Employee e : b) {
    		System.out.println(e);
    	}
    	
    	List<Employee> allEmployees = new ArrayList<>();
    	
    	for(Employee e : a) {
    		allEmployees.add(e);
    	}
    	
    	for(Employee e : b) {
    		allEmployees.add(e);
    	}
    	
    	 allEmployees.sort((emp1, emp2) -> {
             int i = emp1.getLastName().compareTo(emp2.getLastName());
             if (i != 0) {
                 return i;
             } else {
                 return emp1.getFirstName().compareTo(emp2.getFirstName());
             }
         });
    	 
    	  try (PrintWriter printWriter = new PrintWriter("employees.csv")) {
    		  
              for (Employee e : allEmployees) {
            	  printWriter.println(e.getLastName() + ", " + e.getFirstName());

              }
          } catch (IOException e) {
              System.out.println("Glückwunsch IDIOT!");
          }


    	
    }

	
}