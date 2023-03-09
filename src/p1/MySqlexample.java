package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

public class MySqlexample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","1234");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from employee");
		while(rs.next()) {
			System.out.println(rs.getString("FirstName"));
			System.out.println(rs.getString(3));
			//stmt.executeUpdate("INSERT INTO Employee VALUES(3,'shiv','jha','kef@gmail.com','123.123.1834',5000)");
		
			
			
		}
		
	}

}
