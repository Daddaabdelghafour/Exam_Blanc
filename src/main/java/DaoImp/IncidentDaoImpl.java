package DaoImp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Set;

import Dao.IncidentDao;
import Model.Incident;
import Utils.DbConnection;


public class IncidentDaoImpl implements IncidentDao {

	
	@Override 
	public void inserer(Incident i) {
		
		try { 
		DbConnection db = new DbConnection();
		Connection conn = db.getConnection();
		String query = "insert into incident(reference,time,status,memebre_id)"
				+ "values(?,?,?,?)";
		
		PreparedStatement stmt = conn.prepareStatement(query);
		stmt.setString(1, i.getReference());
		stmt.setTimestamp(2, i.getTime());
		stmt.setString(3, i.getStatus());
		stmt.setInt(4, i.getMembre().getIdentifiant());
		
		int r = stmt.executeUpdate();
		if( r > 0) {
			System.out.println("Insertion avec Success !!");
		}
		
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
	
	
	
	@Override
	public void inser(Set<Incident> is){
		try {
		DbConnection db = new DbConnection();
		Connection conn = db.getConnection();
		String query = "insert into incident(reference,time,status,memebre_id)"
				+ "values(?,?,?,?) ";
		
		PreparedStatement stmt = conn.prepareStatement(query);
		
		for(Incident i : is) {
			stmt.setString(1, i.getReference());
			stmt.setTimestamp(2, i.getTime());
			stmt.setString(3, i.getStatus());
			stmt.setInt(4, i.getMembre().getIdentifiant());
			stmt.addBatch();
		}
		
		stmt.executeBatch();
		System.out.println("Insertion de multiple Incident avec Success");
		
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	
	
	
}
