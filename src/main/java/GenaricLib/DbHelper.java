package GenaricLib;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbHelper {
	public static ResultSet getDbValue(String query) {
		try {
			Statement stmt=Baseclass.conn.createStatement();
			ResultSet rs=stmt.executeQuery(query);
			return rs;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return null;
	}

}
