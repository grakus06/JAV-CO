package fr.poec.javaco.electrical;

public class Lamp implements Pluggable{
	@Override
	public void power(boolean on) {
		System.out.println("appel de power sur lamp " + on );
	}

}
