package StructuralPatterns.Composite.Example1;

import java.util.ArrayList;

public class Management implements Company{
	
	public String managementName;
	public ArrayList<Company> employees;
	
	public Management(String managementName) {
		this.managementName = managementName;
		this.employees = new ArrayList<>();
	}
	
	public void addEmployee(Company object) {
		this.employees.add(object);	
	}
	
	@Override
	public int cost() {
		
		int totalSalary = 0;		
        for (Company employee : employees) {
        	totalSalary += employee.cost();
        }
        
        return totalSalary;
	};
	
    @Override
    public String toString() {
        return "Management: " + managementName + ", Total cost: " + cost();
    }

}
