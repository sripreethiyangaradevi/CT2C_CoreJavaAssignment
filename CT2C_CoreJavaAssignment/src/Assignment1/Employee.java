package Assignment1;


	

	/**
	 * The Employee class represents a generic employee.
	 * Demonstrates the use of private attributes with getters and setters.
	 */
	public class Employee {
	    // Private attributes (encapsulation)
	    private String name;
	    private String employeeId;
	    private double salary;

	    // Constructor
	    public Employee(String name, String employeeId, double salary) {
	        this.name = name;
	        this.employeeId = employeeId;
	        this.salary = salary;
	    }

	    // Getters and Setters
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getEmployeeId() {
	        return employeeId;
	    }

	    protected void setEmployeeId(String employeeId) {  // protected: accessible to subclasses
	        this.employeeId = employeeId;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    public void setSalary(double salary) {
	        this.salary = salary;
	    }

	    // Display method
	    public void displayInfo() {
	        System.out.println("Name: " + name + ", ID: " + employeeId + ", Salary: " + salary);
	    }
	}



