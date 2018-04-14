package lab04;

public class HockeyPlayer extends Employee implements Comparable<HockeyPlayer> {
	
	int numberOfGoals;
	
	public HockeyPlayer(String name,int numberOfGoals){
		super(name);
		setNumberOfGoals(numberOfGoals);
	}
	
	public void setNumberOfGoals(int numberOfGoals) {
		this.numberOfGoals = numberOfGoals;
	}
	
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
	public boolean equals(Object obj) {
		if (obj==null){
			return false;
		}
		if (this.equals(obj)){
			return true;
		}
		if (!(obj instanceof HockeyPlayer)){
			return false;
		}else{
			HockeyPlayer obj1=(HockeyPlayer)obj;
			return (obj1.getNumberOfGoals()==this.getNumberOfGoals());
		}
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
