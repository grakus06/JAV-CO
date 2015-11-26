package fr.poec.javaco.electrical;

public interface Pluggable {
	/* une interface  déclare une fonction
	 * il n'y a pas de définition: sauf depuis java 8
	 */
	// pas de variables, uniquement des constantes
	// public pas la peine car par defaut une i/f est public abstract
	void power(boolean on);

}
