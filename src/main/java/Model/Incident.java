package Model;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Incident {

	private String reference;
	private Timestamp  time;
	private String status;
	private Membre m;
	
	
	public Incident(String r , Timestamp t , String s , Membre m) {
		this.reference=r;
		this.time=t;
		this.status=s;
		this.m=m;
	}
	
	
	
	public Incident(String r , java.sql.Timestamp timestamp , String s) {
		this.reference=r;
		this.time=timestamp;
		this.status=s;
	}
	
	public Incident() {
		
	}
	
	public String getReference() {
		return this.reference;
	}
	
	public Timestamp getTime() {
		return this.time;
	}
	
	public String getStatus() {
		return this.status;
	}
	
	public Membre getMembre() {
		return this.m;
	}
	
	
}
