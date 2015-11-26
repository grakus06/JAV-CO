package fr.poec.javaco.i18n;

import java.text.MessageFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class MainI18n {

	public static void main(String[] args) {
		Locale frenchLocale = new Locale("fr","FR");
		// le fichier doit s'appeler messages_fr_FR.properties
		ResourceBundle frenchResourceBundle = ResourceBundle.getBundle("fr.poec.javaco.i18n.messages", frenchLocale);
		System.out.println(frenchResourceBundle.getString("greetings"));
		System.out.println(frenchResourceBundle.getString("adios"));
		Locale usLocale = new Locale("en","US");
		ResourceBundle usResourceBundle = ResourceBundle.getBundle("fr.poec.javaco.i18n.messages", usLocale);
		System.out.println(usResourceBundle.getString("greetings"));
		System.out.println(usResourceBundle.getString("adios"));
		
        // output the message without formating
		System.out.println(usResourceBundle.getString("hello"));

		String messageToFormat = usResourceBundle.getString("hello");
		System.out.println(messageToFormat);
		MessageFormat messageFormat = new MessageFormat("");
		messageFormat.applyPattern(messageToFormat);
		Object[] arguments={		"claude","marescot"};
		String result = messageFormat.format(arguments);
		System.out.println(result);
		
		result = MessageFormat.format(messageToFormat, new Object[] {"Guy", "Golo"});
		System.out.println(result);
		
		// we can use this to set date and number in the local format
		messageFormat.setLocale(frenchLocale);
		result = messageFormat.format(new Object[] {new Date(), new Double(123.45)});
		System.out.println(result);
		messageFormat.setLocale(usLocale);
		result = messageFormat.format(new Object[] {new Date(), new Double(123.45)});
		System.out.println(result);
	

	}

}
