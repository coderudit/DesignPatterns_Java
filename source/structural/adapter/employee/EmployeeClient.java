package structural.adapter.employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {
	
	public List<IEmployee> getEmployeeList(){
		List<IEmployee> employees = new ArrayList<>();
		IEmployee employeeFromDB = new EmployeeDB("1234", "john", "wick", "john@wick.com");
		employees.add(employeeFromDB);
		
		IEmployeeLDAP employeeFromLDAP = new EmployeeLDAP("4321", "annalise", "keatings", "annalise@keatings.com");
		IEmployee employeeFromLDAPAdapterObject = new EmployeeLDAPAdapter(employeeFromLDAP);
		employees.add(employeeFromLDAPAdapterObject);
		
		return employees;
	}
}
