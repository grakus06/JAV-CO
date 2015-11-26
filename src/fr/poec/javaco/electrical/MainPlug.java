package fr.poec.javaco.electrical;

public class MainPlug {
	public static void main(String[] args){
		Plug plug = new Plug();
		
		Lamp lamp = new Lamp();
		plug.plugDevice(lamp);
		plug.power(true);
		
		TV tv = new TV();
		plug.plugDevice(tv);
		
		plug.power(true);
	}

}
