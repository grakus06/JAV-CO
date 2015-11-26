package fr.poec.javaco.inheritance;

public class Personn {
	private String firstName;
	private String lastName;

	/* on enleve le constructeur par defaut pour voir le pb dans la classe fille
	public Personn() {
//		System.out.println("objet Personn crée sans initialisation");
		// attention on ne peut pas appeler une fn avant this()
		// possible uniquement si on fait this.
		this(null,null);
	
	}
	*/
	
	public Personn(String firstname, String lastname) {
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
