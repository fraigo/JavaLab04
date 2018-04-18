package lab04;

/**
 * hockeyPlayer class
 * @author Francisco Igor
 *
 */
public class HockeyPlayer extends Employee implements Comparable<HockeyPlayer> {
	
	/**
	 * Number of goals
	 */
	int numberOfGoals;
	
	/**
	 * Constructor
	 * @param name Employee name
	 * @param numberOfGoals Number of goals
	 */
	public HockeyPlayer(String name,int numberOfGoals){
		super(name);
		setNumberOfGoals(numberOfGoals);
	}
	
	/**
	 * Sets the Number of goals
	 * @param numberOfGoals Number of goals
	 */
	public void setNumberOfGoals(int numberOfGoals) {
		this.numberOfGoals = numberOfGoals;
	}
	
	/**
	 * Gets the Number of goals
	 * @return Number of goals
	 */
	public int getNumberOfGoals() {
		return numberOfGoals;
	}

	@Override
	public double getOverTimePayRate() {
		return 0.0;
	}

	@Override
	public DressCode getDressCode() {
		return DressCode.JERSEY;
	}

	@Override
	public boolean isPaidSalary() {
		return true;
	}

	@Override
	public boolean postSecondaryEducationRequired() {
		return false;
	}

	@Override
	public String getWorkVerb() {
		return "play";
	}

	@Override
	public String toString() {
		return super.toString()+"\n Number of goals:"+getNumberOfGoals();
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numberOfGoals;
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
		HockeyPlayer other = (HockeyPlayer) obj;
		if (numberOfGoals != other.numberOfGoals) {
			return false;
		}
		return true;
	}

	@Override
	public int compareTo(HockeyPlayer obj1) {
		if (obj1.getNumberOfGoals()>this.getNumberOfGoals()){
			return -1;
		}else if (obj1.getNumberOfGoals()<this.getNumberOfGoals()){
			return 1;
		}else{
			return 0;
		}
	}
	

}
