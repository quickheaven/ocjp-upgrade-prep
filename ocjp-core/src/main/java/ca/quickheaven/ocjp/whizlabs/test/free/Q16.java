package ca.quickheaven.ocjp.whizlabs.test.free;

import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

public class Q16 {

	public static void main(String[] args) {
		Locale locale = new Locale.Builder().setLanguage("it").setRegion("IT").build();
		ResourceBundle resourceBundle = ResourceBundle.getBundle("messages", locale);
		Enumeration<String> keys = resourceBundle.getKeys();
		while (keys.hasMoreElements()) {
			String key = keys.nextElement();
			String value = resourceBundle.getString(key);
			System.out.print(key + " : " + value); // cancel: Cancel yes: SI cancel : Cancel

			// Since file messages_it_IT.properties is the first file to be loaded, its
			// properties is printed out prior to the ones from the base resources.

			// When the bundle file for a specified local exists, its key values override
			// the ones in the default or base resources. In this case, the value of key yes
			// is taken from the messages_it_IT.properties file.
		}
	}

}
