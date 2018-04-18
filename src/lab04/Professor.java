package lab04;

/**
 * Class Professor
 * @author Francisco Igor
 *
 */
public class Professor extends Employee implements Comparable<Professor>{
	
	/**
	 * Teaching major
	 */
	String teachingMajor;

	/**
	 * Constructor
	 * @param name Employee name
	 * @param teachingMajor Teaching major
	 */
	public Professor(String name,String teachingMajor){
		super(name);
		setTeachingMajor(teachingMajor);
	}
	
	/**
	 * Sets the Teaching major
	 * @param teachingMajor Teaching major
	 */
	public void setTeachingMajor(String teachingMajor) {
		this.teachingMajor = teachingMajor;
	}
	
	/**
	 * Gets the Teaching major
	 * @return Teaching major
	 */
	public String getTeachingMajor() {
		return teachingMajor;
	}
	
	@Override
	public double getOverTimePayRate() {
		return 1.5;
	}
	
	@Override
	public DressCode getDressCode() {
		return DressCode.FANCY;
	}

	@Override
	public boolean isPaidSalary() {
		return true;
	}

	@Override
	public boolean postSecondaryEducationRequired() {
		return true;
	}

	@Override
	public String getWorkVerb() {
		return "teach";
	}

	@Override
	public String toString() {
		return super.toString()+"\n Teaching major:"+getTeachingMajor();
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((teachingMajor == null) ? 0 : teachingMajor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Professor other = (Professor) obj;
		if (teachingMajor == null) {
			if (other.teachingMajor != null) {
				return false;
			}
		} else if (!teachingMajor.equals(other.teachingMajor)) {
			return false;
		}
		return true;
	}

	@Override
	public int compareTo(Professor obj1) {
		if (this.getTeachingMajor().equals("Computer Science") && !obj1.getTeachingMajor().equals("Computer Science")){
			return 1;
		}else if (!this.getTeachingMajor().equals("Computer Science") && obj1.getTeachingMajor().equals("Computer Science")){
			return -1;
		}else{
			return 0;
		}
	}
	
	


}
