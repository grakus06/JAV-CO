package fr.poec.javco.types;

public class MainTypes {

	public static void main(String[] args) {
		// types primitifs
		// ----entiers
		byte b =8;
		
		short s = 16;
		
		int iDec = 3258762;
		int iHex = 0x1a1b1c1d;
		int iBin =0b11010;

		long l =6898654;
		long lBig = 123456789L;
		// on peut utiser les underscores pour améliorer la lisibilité
		long creditcardid = 1234_5678_9123_5487L;
		float bytes = 0101_111_1001_1;
		
		
		//--- flottants
		float fl=1.25f;
		
		double db = 2.56874;
		double dscient = 1.234e-2;
		
		// boolean
		boolean boo = true;
		
		// char 16 bit unicode defaut \u0000  Max \uffff
		char ch = 'e';
		char cPoint = '\u1234';
		
		// types Wrapper:permet de'avoir des fonctions utiles
		int res = Integer.parseInt("1234");
		System.out.println(res);
		
		
	}

}
