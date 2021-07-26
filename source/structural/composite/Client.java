package structural.composite;

public class Client {
	public static void main(String[] args) {
		
		//Complex object 1
		Employee dev1 = new Developer("Harpreet", 1, 5, 5);
		Employee dev2 = new Developer("Pawanpreet", 2, 6, 4);
        
        EmployeeDirectory engDirectory = new EmployeeDirectory();
        engDirectory.addEmployee(dev1);
        engDirectory.addEmployee(dev2);
        System.out.println("Developers salary: " + engDirectory.calculateSalaryForHierarchy());
        
        //Complex object 2
        Employee man1 = new Manager("Rimal Singh", 1, 3, 5);
        Employee man2 = new Manager("Salil", 1, 4, 5);
          
        EmployeeDirectory accDirectory = new EmployeeDirectory();
        accDirectory.addEmployee(man1);
        accDirectory.addEmployee(man2);
        System.out.println("Managers salary: " + accDirectory.calculateSalaryForHierarchy());
        
        //Complex object 3
        EmployeeDirectory directory = new EmployeeDirectory();
        directory.addEmployee(engDirectory);
        directory.addEmployee(accDirectory);
        System.out.print("Company salary: " + directory.calculateSalaryForHierarchy());
	}
}
