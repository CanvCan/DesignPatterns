package StructuralPatterns.Composite;

public class Employee implements CompanyComposite{
	
	public String name;
	public int salary;
	
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public int cost() {
		return this.salary;
	};
	
    @Override
    public String toString() {
        return "Employee: " + name + ", Salary: " + salary;
    }

}
