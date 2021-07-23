package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDirectory extends Employee {

	private List<Employee> employeeList = new ArrayList<Employee>();
	
	public EmployeeDirectory()
	{
		this(null, 0, 0, 0);
	}
	
	public EmployeeDirectory(String name, long empId, int position, int rating) {
		super(name, empId, position, rating);
	}

	@Override
	public int calculateSalaryForHierarchy() {
		int salary = 0;
		for(Employee employee: employeeList)
		{
			salary += employee.calculateSalaryForHierarchy();
		}
		return salary;
	}
	
	public void addEmployee(Employee emp)
    {
        employeeList.add(emp);
    }
       
    public void removeEmployee(Employee emp)
    {
        employeeList.remove(emp);
    }

}
