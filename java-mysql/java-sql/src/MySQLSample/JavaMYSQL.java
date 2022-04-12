package MySQLSample;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.DriverManager;

public class JavaMYSQL {
			
		static final String user = "root";
		static final String password = "itjob";
		static final String url = "jdbc:mysql://localhost:3306/companydata";
		
		static Connection con = null;

	public static void main(String[] args) {
		
		
//		mySQLTest1();
		mySQLTest2();
		
		}

	private static void mySQLTest2() {
		try {
			con = DriverManager.getConnection(url,user,password);
			
			var sql = "select * from country";
			var statement = con.prepareStatement(sql);	
			var rs = statement.executeQuery();
			
			while (rs.next()) {
				System.out.println(rs.getString("countryCd") + ", " + rs.getString("countryName"));
			}
			
			rs.close();
			statement.close();
			con.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void mySQLTest1() {
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String createtable = "insert into empinfo(empCd,name,birthday,countryCd,sexCd,year) "
					+ "values (\"100031\",\"�h��D����\",\"2019-04-24\",\"011\",\"03\",0);";
			
			PreparedStatement prepStmt1 = con.prepareStatement(createtable);
			
			prepStmt1.execute();
			con.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
}
