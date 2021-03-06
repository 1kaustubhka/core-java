package assignmentOne.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DbUtil {
	
	private static String className = "com.mysql.cj.jdbc.Driver";
	private static String dbUrl;
	private static String dbUser;
	private static String dbPassword;
	
	static {		//if want to execute something during class loading
		try {
			FileReader reader = new FileReader("d:\\db.properties");
			Properties props = new Properties();
			
			props.load(reader);
			dbUrl = props.getProperty("dbUrl");
			dbUser = props.getProperty("dbUser");
			dbPassword = props.getProperty("dbPassword");
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Connection getCon() throws Exception{
		Class.forName(className);	
		Connection con 
		= DriverManager.getConnection(dbUrl, dbUser, dbPassword);
		
		return con; 
	}
}
