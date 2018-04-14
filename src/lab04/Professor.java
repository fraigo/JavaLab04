package lab04;

public class Professor extends Employee implements Comparable<Professor>{
	
	String teachingMajor;

	public Professor(String name,String teachingMajor){
		super(name);
		setTeachingMajor(teachingMajor);
	}
	
	public void setTeachingMajor(String teachingMajor) {
		this.teachingMajor = teachingMajor;
	}
	
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
	public boolean equals(Object obj) {
		if (obj==null){
			return false;
		}
		if (this.equals(obj)){
			return true;
		}
		if (!(obj instanceof Professor)){
			return false;
		}else{
			Professor obj1=(Professor)obj;
			return (obj1.getTeachingMajor().equals(this.getTeachingMajor()));
		}
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
