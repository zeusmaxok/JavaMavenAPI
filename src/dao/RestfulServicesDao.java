package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import beans.RestResponse;
import database.DBManager;

public class RestfulServicesDao {

	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	DBManager db;
	
	public RestfulServicesDao() {
		db = new DBManager();
	}
	
	public void addServicesToList (RestResponse res) {
		
		System.out.println("RestfulServicesDao is called");
		
		String selectStmt = "SELECT invokeFrom, invokeTo FROM cis571.webservicesmapping WHERE invokeFrom = ?;";
		
		con = db.getConn();
		
		try {
			ps = con.prepareStatement(selectStmt);
			
			ps.setString(1, res.getServ());
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				res.addToServsList(rs.getString("invokeTo"));
			}
			
			System.out.println("RestfulServicesDao is completed");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
