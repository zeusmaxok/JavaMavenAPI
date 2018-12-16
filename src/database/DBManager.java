package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSourceFactory;



public class DBManager {

	private static final String configFile = "dbcp.properties";
	private static DataSource dataSource;

	public DBManager() {
		Properties dbProperties = new Properties();
		try {
			dbProperties.load(DBManager.class.getClassLoader().getResourceAsStream(configFile));
			dataSource = BasicDataSourceFactory.createDataSource(dbProperties);
			Connection conn = getConn();

			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Connection getConn() {
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	public void closeConn(ResultSet rs, PreparedStatement ps, Connection conn) {

		try {
			if (rs != null && !rs.isClosed()) {
				rs.close();
			}

			if (ps != null && !ps.isClosed()) {
				ps.close();
			}

			if (conn != null && !conn.isClosed()) {
				conn.setAutoCommit(true);
				conn.close();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}