package lab04;

/**
 * DressCode Enumeration
 * @author Francisco Igor
 *
 */
public enum DressCode {

	JERSEY("jersey"), FANCY("fancy"), ANYTHING("anything"), UNIFORM("uniform");
	
	/**
	 * DressCode description
	 */
	private String type;
	
	private DressCode(String type){
		this.type=type;
	}
}
