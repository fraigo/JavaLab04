package lab04;

public abstract class Employee implements Employable {
	
	private String name;
	
	public Employee(String name){
		setName(name);
	}

	public abstract double getOverTimePayRate();
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "Name:"+getName()+"\n DressCode:"+getDressCode()+"\n Paid:"+isPaidSalary()+"\n needsPostSecondary:"+postSecondaryEducationRequired()+"\n Work:"+getWorkVerb()+"\n Pay Rate:"+getOverTimePayRate();
	}
		
}
