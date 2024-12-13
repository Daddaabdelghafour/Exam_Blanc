package MembreLoader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import Model.Membre;
import DaoImp.MembreDaoImpl;

public class memberLoad {

	public Set<Membre> chargerListeMembre(String nomFichier){
		MembreDaoImpl imp = new MembreDaoImpl();
		String ligne;
		Set<Membre> membres = new HashSet<Membre>();
		try {
			
			BufferedReader br = new BufferedReader(new FileReader(nomFichier));
		
		
			
		br.readLine();
		
		while((ligne = br.readLine())!= null) {
			String[]parts = ligne.split(",");
			
			if(parts.length == 5) {
				int id = Integer.parseInt(parts[0].trim());
                String nom = parts[1].trim();
                String prenom = parts[2].trim();
                String email = parts[3].trim();
                String phone = parts[4].trim();
                Membre membre = new Membre(id,nom,prenom,email,phone);
				membres.add(membre);
				imp.insere(membre);

			}
			
			
			
		}
		
		}catch(IOException e) {
			e.printStackTrace();
		}
		
        return membres;

	}
	
	
	
	
	public static void main(String[] args) {
		
		memberLoad m = new memberLoad();
		Set<Membre> myset = m.chargerListeMembre("C:\\Users\\dadda\\Desktop\\eclipseprojects\\Exam\\src\\main\\ressources\\membres.csv");
		for(Membre c : myset) {
			System.out.println(c);
		}
		
		
	}
	
	
	
	
	
	
}
