package lab04;

public class Parent extends Employee implements Comparable<Parent>{
	
	int numberOfHoursSpentPerWeekWithKids;

	public Parent(String name,int hoursSpent){
		super(name);
		setNumberOfHoursSpentPerWeekWithKids(hoursSpent);
	}
	
	public void setNumberOfHoursSpentPerWeekWithKids(int hours) {
		this.numberOfHoursSpentPerWeekWithKids = hours;
	}
	
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
	public boolean equals(Object obj) {
		if (obj==null){
			return false;
		}
		if (this.equals(obj)){
			return true;
		}
		if (!(obj instanceof Parent)){
			return false;
		}else{
			Parent obj1=(Parent)obj;
			return (obj1.getNumberOfHoursSpentPerWeekWithKids()==this.getNumberOfHoursSpentPerWeekWithKids());
		}
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
