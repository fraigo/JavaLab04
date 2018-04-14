package lab04;

public enum DressCode {

	JERSEY("jersey"), FANCY("fancy"), ANYTHING("anything"), UNIFORM("uniform");
	
	private String type;
	
	private DressCode(String type){
		this.type=type;
	}
}
