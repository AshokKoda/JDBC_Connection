package jdbcconnection;

import java.sql.DriverManager;

public class JDBCConnection {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Drivers load successfully.");
		} catch (Exception e) {
			System.out.println("Drivers not load.");
		}
		
		String URL = "jdbc:mysql://localhost:3306/emp_payroll_service";
		
		try {
			DriverManager.getConnection(URL, "root", "Koda@1996");
			System.out.println("Connection established.");
		} catch (Exception e) {
			System.out.println("Connection not established.");
		}

	}

}
