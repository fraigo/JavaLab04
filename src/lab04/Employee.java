package lab04;

/**
 * Employee Class
 * @author Francisco Igor
 *
 */
public abstract class Employee implements Employable {
	
	/**
	 * Employee name
	 */
	private String name;
	
	/**
	 * Constructor using name
	 * @param name Employee name
	 */
	public Employee(String name){
		setName(name);
	}

	/**
	 * Return the overtime pay rate for this employee
	 * @return Pay rate
	 */
	public abstract double getOverTimePayRate();
	
	/**
	 * Sets the name of the employee
	 * @param name Employee name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Gets the employee name
	 * @return Employee name
	 */
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "Name:"+getName()+"\n DressCode:"+getDressCode()+"\n Paid:"+isPaidSalary()+"\n needsPostSecondary:"+postSecondaryEducationRequired()+"\n Work:"+getWorkVerb()+"\n Pay Rate:"+getOverTimePayRate();
	}
		
}
