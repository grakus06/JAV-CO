package fr.poec.javco.createclass;

public class MAin {

	public static void main(String[] args) {
		/**
		 * instanciation de la class Person new Personn()
		 * new Person : creation d'un objet de type Person (allocation)
		 * () : appel d'un constructeur par defaut sans parametre
		 * l'opérateur new retourne une reference vers l'objet qu'il a crée
		 */
		Person person=new Person();
		person.setFirstName("claude");
		person.setLastName("Marescot");
		
		System.out.println("Personne: " + person.getFirstName() + " " + person.getLastName());
		
		// 2eme methode avec constructeur avec parametres
		Person person2 = new Person("Vladimir","Poutin");
		
		System.out.println("Personne: " + person2.getFirstName() + " " + person2.getLastName());

	}

}
