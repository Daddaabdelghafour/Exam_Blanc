package Model;

import java.util.List;

public class Membre {

	private int identifiant;
	private  String nom;
	private String prenom;
	private String email;
	private String phone;
	private List<Incident> incidents;
	
	
	
	public Membre(int i , String n , String p , String e , String ph) {
		this.identifiant=i;
		this.nom=n;
		this.prenom=p;
		this.email=e;
		this.phone=ph;
	}
	
	
	public Membre() {
		
	}
	
	
	
	public int getIdentifiant() {
		return this.identifiant;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public String getPrenom() {
		return this.prenom;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public String getPhone() {
		return this.phone;
	}
	
	public List<Incident> getIncidents(){
		return this.incidents;
	}
	
	
	public void setIdentifiant(int i) {
		this.identifiant=i;
	}
	public void setNom(String n) {
		this.nom=n;
	}
	
	
	public void setEmail(String e) {
		this.email=e;
	}
	
	public void setPhone(String p) {
		this.phone=p;
	}
	
	public void setIncidents(List<Incident> i) {
		this.incidents=i;
	}
	
	
	 @Override
	    public String toString() {
	        return "Membre{id=" + this.identifiant + ", nom='" + nom + "', prenom='" + prenom + "', email='" + email + "', phone='" + phone + "'}";
	    }
	
	
}
