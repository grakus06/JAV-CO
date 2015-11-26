package objects;

import java.util.ArrayList;

public class UneClasse {
private ArrayList<String> uneListe = new ArrayList<>();

	public UneClasse() {
		// TODO Auto-generated constructor stub
	}
	
	// copy constructor
	public UneClasse(UneClasse objectToCopy) {
		for (String s: objectToCopy.uneListe) {
			this.uneListe.add(new String(s));
		}
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	private void doSomething() {
		System.out.println("do something");
		
	}

}
