package structural.adapter.employee;

public class EmployeeLDAPAdapter implements IEmployee {

	private IEmployeeLDAP employeeLDAP;
		
	public EmployeeLDAPAdapter(IEmployeeLDAP employeeLDAP) {
		super();
		this.employeeLDAP = employeeLDAP;
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return this.employeeLDAP.getCn();
	}

	@Override
	public String getFirstName() {
		// TODO Auto-generated method stub
		return this.employeeLDAP.getGivenName();
	}

	@Override
	public String getLastName() {
		// TODO Auto-generated method stub
		return this.employeeLDAP.getSurName();
	}

	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return this.employeeLDAP.getMail();
	}
	
}
