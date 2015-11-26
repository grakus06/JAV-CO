package fr.poec.javaco.electrical;

public class TV implements Pluggable{
	@Override
	public void power(boolean on) {
		System.out.println("appel de power sur tv " + on );
	}

}
