package fr.poec.javaco.abstact;

public class MainTemplate {

	public static void main(String[] args) {
		Template template = new Template();
		template.process();

		// heritage : la classe fille a redefini la methode faisLeJob
		/* on doit avoir 
		 * avant
         * process tres long
		 * apres
         * avant
         * process pas tres long
         * apres
		 */
		HelloWordStrategy helloWordStrategy = new HelloWordStrategy();
		helloWordStrategy.process();
	}

}
