package fr.poec.javco.createclass;

public class Person {
	private String firstName;
	private String lastName;
	
	public Person() {
//		System.out.println("objet Personn crée sans initialisation");
		// attention on ne peut pas appeler une fn avant this()
		// possible uniquement si on fait this.
		this(null,null);
	
	}
	
	public Person(String firstname, String lastname) {
		this.firstName = firstname;
		this.lastName = lastname;
		System.out.println("objet Personn crée avec initialisation");
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	

}
