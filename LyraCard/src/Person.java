
public class Person {
	
	//Attributes
	private String name;
	
	//Constructor
	public Person() {
	}
	public Person (String name) {
		this.name = name;
	}
	
	//Setter y Getters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//toString
	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	

}
