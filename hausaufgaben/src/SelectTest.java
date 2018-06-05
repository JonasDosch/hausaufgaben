package jdbc;

import java.beans.Statement;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectTest {

	public static void main(String[] args) {
		// 1. Treiber laden
		try {
			Class.forName("org.sqlite.JDBC");
		} catch (ClassNotFoundException e) {
			System.err.println("Konnte Treiber nicht laden!");
		}
		
		// 2. Datenbankverbindung aufbauen
		String dbUrl = "jdbc:sqlite:datenbank.sqlite";
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(dbUrl);
		} catch (SQLException e) {
			System.err.println("Datenbankverbindung konnte nicht aufgebaut werden.");
		}
		
		// 3. Befehle an die Datenbank schicken
		PreparedStatement stmt;
		try {
			System.out.print("Anfangsbuchstabe: ");
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String anfangsbuchstabe = in.readLine().trim();
			System.out.println("Suche nach " + anfangsbuchstabe + ":");
			
			// Variablen einfügen ist gefährlich -> Injection
			//stmt = conn.prepareStatement(
			//		"SELECT * FROM person WHERE name = '" + anfangsbuchstabe + "';");
			stmt = conn.prepareStatement(
					"SELECT * FROM person WHERE name = ?;");
			stmt.setString(1, anfangsbuchstabe);
			ResultSet ergebnis = stmt.executeQuery();

			while (ergebnis.next()) {
				String name = ergebnis.getString("name");
				System.out.println(name);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		};
		System.out.println("Fertig.");
	}

}









