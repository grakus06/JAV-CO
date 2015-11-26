package objects;

public class MainPersonn {

	public static void main(String[] args) {
		Person p = new Person("monPrenom","nomMon");
		Person p2 = new Person("monPrenom","nomMon");
		System.out.println(p);
		System.out.println(p.getClass().getCanonicalName());
		System.out.println(p.getClass().getCanonicalName()
				+ "@"
				+ Integer.toHexString(p.hashCode()));
		
		System.out.println(p2);
		// on test les references des objets
		// ici opn a 2 objets differents en memoire
		System.out.println(p==p2);
		// par defaut .equals fait ===
		System.out.println(p.equals(p2));
		// on doit redefinir la method equals dansd la classe
	}

}
