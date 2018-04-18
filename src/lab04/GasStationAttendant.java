package lab04;

/**
 * GasStationAttendant class
 * @author Francisco Igor
 *
 */
public class GasStationAttendant extends Employee implements Comparable<GasStationAttendant> {

	/**
	 * Number of dollars stolen 
	 */
	int numberOfDollarsStolenPerDay;
	
	/**
	 * Constructor 
	 * @param name Employee name
	 * @param numberOfDollarsStolenPerDay Number of dollars stolen
	 */
	public GasStationAttendant(String name,int numberOfDollarsStolenPerDay){
		super(name);
		setNumberOfDollarsStolenPerDay(numberOfDollarsStolenPerDay);
	}
	
	/**
	 * Sets the Number of dollars stolen
	 * @param dollars Number of dollars stolen
	 */
	public void setNumberOfDollarsStolenPerDay(int dollars) {
		this.numberOfDollarsStolenPerDay = dollars;
	}
	
	/**
	 * Gets the Number of dollars stolen
	 * @return Number of dollars stolen
	 */
	public int getNumberOfDollarsStolenPerDay() {
		return numberOfDollarsStolenPerDay;
	}
	
	@Override
	public double getOverTimePayRate() {
		return 1.5;
	}
	
	@Override
	public DressCode getDressCode() {
		return DressCode.UNIFORM;
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
		return "pump";
	}

	@Override
	public String toString() {
		return super.toString()+"\n Dollars stealed:"+getNumberOfDollarsStolenPerDay();
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numberOfDollarsStolenPerDay;
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
		GasStationAttendant other = (GasStationAttendant) obj;
		if (numberOfDollarsStolenPerDay != other.numberOfDollarsStolenPerDay) {
			return false;
		}
		return true;
	}

	@Override
	public int compareTo(GasStationAttendant obj1) {
		if (obj1.getNumberOfDollarsStolenPerDay()>this.getNumberOfDollarsStolenPerDay()){
			return -1;
		}else if (obj1.getNumberOfDollarsStolenPerDay()<this.getNumberOfDollarsStolenPerDay()){
			return 1;
		}else{
			return 0;
		}
	}
	
	

}
