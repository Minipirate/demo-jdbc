/**
 * 
 */
package fr.diginamic.props;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

import org.mariadb.jdbc.Driver;

/**
 * @author Ness'ti
 *
 */
public class TestConnectionJdbc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			// 1 => chargement du driver (classe fournie par la lib Mariadb
			DriverManager.registerDriver(new Driver());

		} catch (SQLException e) {
			System.out.println("Impossible de charger le driver MariaDB !");
		}
		try {
			// 2 => demander au DriverManager de fournir une co à une bdd de type MariaDB
			ResourceBundle props = ResourceBundle.getBundle("data");
			String url = props.getString("database.url");
			String user = props.getString("database.user");
			String password = props.getString("database.password");

			Connection connection = DriverManager.getConnection(url, user, password);

			

			// 3 => Fermeture de la co
			System.out.println(connection.isClosed());

		} catch (SQLException e) {
			System.out.println("Impossible de se connecter à la base de données" + e.getMessage());
		}
	}
}
