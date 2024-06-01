package StructuralPatterns.Composite;

import java.util.ArrayList;

public class Management implements CompanyComposite{
	
	public String managementName;
	public ArrayList<CompanyComposite> employees;
	
	public Management(String managementName) {
		this.managementName = managementName;
		this.employees = new ArrayList<>();
	}
	
	public void addEmployee(CompanyComposite object) {
		this.employees.add(object);	
	}
	
	@Override
	public int cost() {
		
		int totalSalary = 0;		
        for (CompanyComposite employee : employees) {
        	totalSalary += employee.cost();
        }
        
        return totalSalary;
	};
	
    @Override
    public String toString() {
        return "Management: " + managementName + ", Total cost: " + cost();
    }

}
