package org.hazi.JDBCDataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnectionTest {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager
					.getConnection("jdbc:sqlite:D:\\hazi_5307\\workspace\\AAAA\\JAVABasics\\testjava.db");
			Statement statement = con.createStatement();
			statement.execute("CREATE TABLE IF NOT EXISTS CONTACTS(NAME TEXT, PHONE INTEGER, EMAIL TEXT)");
			statement.execute("INSERT INTO CONTACTS(NAME, PHONE, EMAIL) VALUES('HAZI', 123451, 'HAZI@EMAIL.COM')");
			statement.execute("INSERT INTO CONTACTS(NAME, PHONE, EMAIL) VALUES('HAZI1', 12345, 'HAZI1@EMAIL.COM')");
			statement.execute("INSERT INTO CONTACTS(NAME, PHONE, EMAIL) VALUES('HAZI2', 123245, 'HAZI2@EMAIL.COM')");
			statement.execute("INSERT INTO CONTACTS(NAME, PHONE, EMAIL) VALUES('HAZI3', 123454, 'HAZI3@EMAIL.COM')");
			// statement.execute("SELECT *FROM CONTACTS");
			// ResultSet results = statement.getResultSet();
			/* We can use executeQuery() to return result set. */
			ResultSet results = statement.executeQuery("SELECT *FROM CONTACTS");
			while (results.next()) {
				System.out.println(
						results.getString("NAME") + " " + results.getInt("PHONE") + " " + results.getString("EMAIL"));
			}
			results.close();
			statement.close();
			con.close();

		} catch (SQLException e) {
			System.out.println("Something went wrong " + e.getMessage());
		}

	}

}
