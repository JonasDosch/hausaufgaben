package jdbc;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreateTest {

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
			stmt = conn.prepareStatement("CREATE TABLE IF NOT EXISTS person ( name VARCHAR(256) NOT NULL );");
			stmt.execute();
			stmt = conn.prepareStatement("INSERT INTO person(name) VALUES('Monika Musterman');");
			stmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		System.out.println("Fertig.");
	}

}









