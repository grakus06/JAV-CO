package fr.poec.javaco.abstact;

	public class Template {
		public void process() {
			System.out.println("avant");
			//System.out.println("process tres long");
			// on appel une fonction 
			FaisLeJob();
			System.out.println("apres");
		}
	
	public void FaisLeJob() {
		System.out.println("process tres long");
	}
}
