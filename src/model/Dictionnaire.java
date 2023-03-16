package model;

public class Dictionnaire {

	private String mot;
	private String definition;
	
	public Dictionnaire() {}
	
	//To-Do jusqu'a la fin
	public Dictionnaire(String mot, String definition) {		
		this.mot = mot;
		this.definition = definition;		
	}
	public String getMot() {
		return mot;
	}
	public void setMot(String mot) {
		this.mot = mot;
	}
	public String getDefinition() {
		return definition;
	}
	public void setDefinition(String definition) {
		this.definition = definition;
	}
	
	public String toString() {
		return String.format(this.mot+" : %s",this.definition);
	}
	
}
