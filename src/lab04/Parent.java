package lab04;

/**
 * Parents class
 * @author Francisco Igor
 *
 */
public class Parent extends Employee implements Comparable<Parent>{
	
	/**
	 * Number of hours spent with kids
	 */
	int numberOfHoursSpentPerWeekWithKids;

	/**
	 * Constructor
	 * @param name Employee name
	 * @param hoursSpent Number of hours spent with kids
	 */
	public Parent(String name,int hoursSpent){
		super(name);
		setNumberOfHoursSpentPerWeekWithKids(hoursSpent);
	}
	
	/**
	 * Sets the Number of hours spent with kids
	 * @param hours Number of hours spent with kids
	 */
	public void setNumberOfHoursSpentPerWeekWithKids(int hours) {
		this.numberOfHoursSpentPerWeekWithKids = hours;
	}
	
	/**
	 * Gets the Number of hours spent with kids
	 * @return
	 */
	public int getNumberOfHoursSpentPerWeekWithKids() {
		return numberOfHoursSpentPerWeekWithKids;
	}
	
	
	@Override
	public double getOverTimePayRate() {
		return -0.2;
	}

	@Override
	public DressCode getDressCode() {
		return DressCode.ANYTHING;
	}

	@Override
	public boolean isPaidSalary() {
		return false;
	}

	@Override
	public boolean postSecondaryEducationRequired() {
		return false;
	}

	@Override
	public String getWorkVerb() {
		return "care";
	}
	
	@Override
	public String toString() {
		return super.toString()+"\n Hours spent with kids:"+getNumberOfHoursSpentPerWeekWithKids();
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numberOfHoursSpentPerWeekWithKids;
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
		Parent other = (Parent) obj;
		if (numberOfHoursSpentPerWeekWithKids != other.numberOfHoursSpentPerWeekWithKids) {
			return false;
		}
		return true;
	}

	@Override
	public int compareTo(Parent obj1) {
		if (obj1.getNumberOfHoursSpentPerWeekWithKids()>this.getNumberOfHoursSpentPerWeekWithKids()){
			return -1;
		}else if (obj1.getNumberOfHoursSpentPerWeekWithKids()<this.getNumberOfHoursSpentPerWeekWithKids()){
			return 1;
		}else{
			return 0;
		}
	}
	

}
