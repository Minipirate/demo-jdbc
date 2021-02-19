/**
 * 
 */
package fr.diginamic.props;

import java.util.Enumeration;
import java.util.ResourceBundle;

/**
 * @author Ness'ti
 *
 */
public class TestConfiguration {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ResourceBundle props = ResourceBundle.getBundle("data");
		String nom = props.getString("nom");
		System.out.println(nom);

		Enumeration<String> keys = props.getKeys();
		while (keys.hasMoreElements()) {
			String key = keys.nextElement();
			System.out.println(key);
			System.out.println(props.getString(key));
		}
	}
}
