package DaoImp;

import Dao.MembreDao;
import Model.Membre;
import Utils.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import Utils.DbConnection;
import java.time.LocalDateTime;

import Model.Incident;
public class MembreDaoImpl implements MembreDao {

	@Override
	public void insere(Membre m) {
		try {
		DbConnection db = new DbConnection();
		Connection conn = db.getConnection();
		String query = "insert into membre(nom,prenom,email,phone)"
				+ "values(?,?,?,?)";
		PreparedStatement stmt = conn.prepareStatement(query);
		stmt.setString(1, m.getNom());
		stmt.setString(2, m.getPrenom());
		stmt.setString(3, m.getEmail());
		stmt.setString(4, m.getPhone());
		
		int r = stmt.executeUpdate();
		
		if(r>0) {
			System.out.println("Insertion avec Success!!");
			
		}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	@Override
	
	public List<Incident> chargerListIncidents(){
		try {
		List<Incident> incidents = new ArrayList<Incident>();
		DbConnection db = new DbConnection();
		Connection conn = db.getConnection();
		String query = "select * from incident";
		PreparedStatement stmt = conn.prepareStatement(query);
		ResultSet rs =stmt.executeQuery();
		
		while(rs.next()) {
			incidents.add(new Incident(rs.getString("reference"),rs.getTimestamp("time"), rs.getString("status")));
		}
	
		return incidents;
		
		
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
