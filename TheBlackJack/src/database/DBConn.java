package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConn {

private Connection conn;
	
	public boolean checkName(String name) {
		
		
		ResultSet re = null;
		boolean result = false;
		

		try {
			
			conn = DriverManager.getConnection("jdbc:sqlite:blackjackdb");
			
			Statement statement = conn.createStatement();

			re = statement.executeQuery("SELECT * FROM Login WHERE name = '" + name + "';");

			if (re.next()) {

				result =  true;
			} else {
				result = false;
			}
			
			conn.close();

		} catch (SQLException e) {

			e.printStackTrace();

		}
		
		return result;
		
	
	}
	
	public void insertNewUser(String name){
		
		
		Statement statement;
		try {
			
			conn = DriverManager.getConnection("jdbc:sqlite:blackjackdb");
			statement = conn.createStatement();
			statement.execute("INSERT INTO Login values ('"+ name +"',0);");
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

	/*public int showScore(){
		
		ResultSet scr;
		Statement statement;
		try {
			
			conn = DriverManager.getConnection("jdbc:sqlite:blackjackdb");
			statement = conn.createStatement();
			scr = statement.executeQuery("SELECT score FROM Login;");
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return int scr;
		
	}*/


}
