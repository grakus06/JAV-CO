package objects;

public class Person {
private String prenom;
  private String nom;
	
	public Person(String prenom, String nom) {
	 this.prenom =prenom;
	 this.nom = nom;
	}
  
  
  public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public String getPrenom() {
	return prenom;
}

public void setPrenom(String prenom) {
	this.prenom = prenom;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((nom == null) ? 0 : nom.hashCode());
	result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Person other = (Person) obj;
	if (nom == null) {
		if (other.nom != null)
			return false;
	} else if (!nom.equals(other.nom))
		return false;
	if (prenom == null) {
		if (other.prenom != null)
			return false;
	} else if (!prenom.equals(other.prenom))
		return false;
	return true;
}

/* use Eclipse generator
@Override
  public boolean equals (Object obj) {
	  if (!(obj instanceof Person)) {
		  return false;
	  }
	  Person p2 = (Person) obj;
	  if (p2 == null) {
		  return false;
	  }
	  else {
		  if ( (this.getPrenom().equals(p2.getPrenom() )) && 
				  (this.getNom().equals(p2.getNom() )) ) {
			  return true;
		  }
	  }
	  return false;
  }
  */

}
