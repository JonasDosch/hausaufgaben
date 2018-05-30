package Frima;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Department implements Iterable<Employee> {
	
    private Map<Integer, Employee> employees;
    private Sequence<Integer> employeeIdSequence;
    private String name;
    
    
    public Department(Sequence<Integer> employeeIdSequence, String name) {
        
    	employees = new HashMap<>();
        
        this.employeeIdSequence = employeeIdSequence;
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public int addEmployee(String f, String l) {
    	
        int eId = employeeIdSequence.next();
        Employee employee = new Employee(f, l);
        employees.put(eId, employee);
        return eId;
    }
    
    @Override
    public Iterator<Employee> iterator() {
        return  employees.values().iterator();
    }


}