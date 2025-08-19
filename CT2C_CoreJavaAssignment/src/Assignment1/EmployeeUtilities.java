package Assignment1;




	import AssignmentMain.employees.Employee;

	/**
	 * Utility class for performing operations on Employee objects.
	 */
	public class EmployeeUtilities {

	    /**
	     * Increase the salary of an employee by a percentage.
	     * @param emp The employee object
	     * @param percentage Percentage to increase
	     */
	    public void increaseSalary(Employee emp, double percentage) {
	        double newSalary = emp.getSalary() + (emp.getSalary() * percentage / 100);
	        emp.setSalary(newSalary);
	        System.out.println("Salary increased for " + emp.getName() + ". New Salary: " + emp.getSalary());
	    }

	    /**
	     * Print details of an employee.
	     * @param emp The employee object
	     */
	    public void printEmployeeDetails(Employee emp) {
	        emp.displayInfo();
	    }
	}



