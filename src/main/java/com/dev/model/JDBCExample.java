package main.java.com.dev.model;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.tomcat.jdbc.pool.JdbcInterceptor;

import java.sql.Connection;

public class JDBCExample {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/cyient";

	static final String USER = "admin";
	static final String PASS = "admin";

	public static void main(String[] args) {
		
		JDBCExample ex=new JDBCExample();
		ex.selectAllClaims();
	}

	private Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Connecting to a selected database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Connected database successfully...");
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}/* finally {
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}*/
		return conn;

	}

	private void selectAllClaims() {
		try {
			Statement statement = getConnection().createStatement();
			ResultSet results=statement.executeQuery("SELECT * from claims");
			while(results.next()){
				int id=results.getInt(1);
				String shortName=results.getString(2);
				String fullName=results.getString(3);
				int status=results.getInt(4);
				System.out.print(" id :"+id);
				System.out.print(" shortName :"+shortName);
				System.out.print(" fullName :"+fullName);
				System.out.print(" status :"+status);
				System.out.println("");
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

		}

	}

}
