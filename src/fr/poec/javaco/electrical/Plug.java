package fr.poec.javaco.electrical;

public class Plug {
	
	private Pluggable pluggable;
  /* on definit une methode qui permet d'avoir un code g�n�rique
    on pluggera des objets de type pluggable, pas de type TV et lamp
    Permet de plus facilement integrer du code de plusieur sentit�s ex 
    on s'entend juste sur l'i:f
   */
	public void plugDevice(Pluggable pluggable) {
		this.pluggable = pluggable;
	}
	
	public void power(boolean on) {
		if (pluggable != null) {
			pluggable.power(on);
		}
	}
}
