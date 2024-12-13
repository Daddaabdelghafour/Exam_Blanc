package Utils;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;


public class DbConnection {
	private Connection conn;
	private static final String url = "jdbc:mysql://localhost:3306/ExamBlanc";
	private static final String username = "root";
	private static final String password = "";
	
	
	public Connection getConnection() {
		try {
			if(conn == null) {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection(url,username,password);
			}
		}catch(SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return conn;
		
	}
	
	
	
	public void CloseConnection() {
		try {
			if(!conn.isClosed()) {
				conn.close();
			}	
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}
	
	
}
