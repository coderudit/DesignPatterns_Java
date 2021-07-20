package structural.adapter.employee;

public class EmployeeLDAP implements IEmployeeLDAP{
	private String cn;
	private String surName;
	private String givenName;
	private String mail;
	
	public EmployeeLDAP(String cn, String givenName, String surName, String mail) {
		super();
		this.cn = cn;
		this.givenName = givenName;
		this.surName = surName;
		this.mail = mail;
	}

	public String getCn() {
		return cn;
	}

	public String getSurName() {
		return surName;
	}

	public String getGivenName() {
		return givenName;
	}

	public String getMail() {
		return mail;
	}
	
}
