package JDBC_test;

import java.sql.*;

public class JdbcTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/student";
		String uname = "root";
		String pass = "omkaraneroot";

		String query = "select * from mydata";

		Connection con = DriverManager.getConnection(url, uname, pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);

		System.out.println("id" + " " + "name");
		while (rs.next()) {
			System.out.println(rs.getInt("id") + " " + rs.getString("name"));
		}

		// System.out.println(name);

		st.close();

		con.close();

	}

}
