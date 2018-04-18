package lab04;

/**
 * Employable Interface
 * @author Francisco Igor
 *
 */
public interface Employable {
	
	/**
	 * Get the DressCode 
	 * @return Dress Code
	 */
	public DressCode getDressCode();
	/**
	 * Checks if has paid salary
	 * @return
	 */
	public boolean isPaidSalary();
	/**
	 * Checks if needs post secondary education
	 * @return
	 */
	public boolean postSecondaryEducationRequired();
	/**
	 * Get the work verb associated to the employee (teach, play)
	 * @return
	 */
	public String getWorkVerb();

}
