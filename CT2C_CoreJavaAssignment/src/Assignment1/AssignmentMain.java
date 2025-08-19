package Assignment1;


	import AssignmentMain.employees.*;
	import AssignmentMain.utilities.EmployeeUtilities;

	/**
	 * Main class to test package and access modifier implementation.
	 */
	public class AssignmentMain {
	    public static void main(String[] args) {
	        // Create Manager and Developer objects
	        Manager mgr = new Manager("Alice", "M101", 80000, "HR");
	        Developer dev = new Developer("Bob", "D202", 60000, "Java");

	        // Create Utilities object
	        EmployeeUtilities utils = new EmployeeUtilities();

	        System.out.println(" Before Salary Increment ");
	        utils.printEmployeeDetails(mgr);
	        utils.printEmployeeDetails(dev);

	        // Increase salary
	        utils.increaseSalary(mgr, 10);
	        utils.increaseSalary(dev, 15);

	        System.out.println("\n After Salary Increment ");
	        utils.printEmployeeDetails(mgr);
	        utils.printEmployeeDetails(dev);
	    }
	}



