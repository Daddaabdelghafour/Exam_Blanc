package Dao;

import java.util.List;
import java.util.Set;

import Model.Incident;
import Model.Membre;

public interface MembreDao {

	public void insere(Membre m);
	public List<Incident> chargerListIncidents() ;
	
	
	
	
}
