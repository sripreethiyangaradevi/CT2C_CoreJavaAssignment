package Assignment1;


	

	/**
	 * The Manager class extends Employee and adds department attribute.
	 */
	public class Manager extends Employee {
	    private String department;

	    public Manager(String name, String employeeId, double salary, String department) {
	        super(name, employeeId, salary);
	        this.department = department;
	    }

	    // Getter and Setter
	    public String getDepartment() {
	        return department;
	    }

	    public void setDepartment(String department) {
	        this.department = department;
	    }

	    @Override
	    public void displayInfo() {
	        super.displayInfo();
	        System.out.println("Department: " + department);
	    }
	}


