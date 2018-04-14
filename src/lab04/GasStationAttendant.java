package lab04;

public class GasStationAttendant extends Employee implements Comparable<GasStationAttendant> {

	int numberOfDollarsStolenPerDay;
	
	public GasStationAttendant(String name,int numberOfDollarsStolenPerDay){
		super(name);
		setNumberOfDollarsStolenPerDay(numberOfDollarsStolenPerDay);
	}
	
	public void setNumberOfDollarsStolenPerDay(int dollars) {
		this.numberOfDollarsStolenPerDay = dollars;
	}
	
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
	public boolean equals(Object obj) {
		if (obj==null){
			return false;
		}
		if (this.equals(obj)){
			return true;
		}
		if (!(obj instanceof GasStationAttendant)){
			return false;
		}else{
			GasStationAttendant obj1=(GasStationAttendant)obj;
			return (obj1.getNumberOfDollarsStolenPerDay()==this.getNumberOfDollarsStolenPerDay());
		}
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
