package Controller;

import Model.Membre;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import DaoImp.MembreDaoImpl;
public class MainViewController {

	@FXML
	private TextField nomField;

	@FXML
	private TextField prenomField;
	

	@FXML
	private TextField emailField;
	

	@FXML
	private TextField phoneField;
	
	
	@FXML 
	public void ButtonClicked() {
		MembreDaoImpl d = new MembreDaoImpl();
		String nom = nomField.getText();
		String prenom = prenomField.getText();
		String email = emailField.getText();
		String phone = phoneField.getText();
		
		Membre m = new Membre(0,nom,prenom,email,phone);		
		
		
		if( nom.isEmpty() || prenom.isEmpty() || email.isEmpty() || phone.isEmpty()) {
			System.out.println("Incomplete Data , Please Retry");
		}
		else {
			d.insere(m);
		}
	}
	
	
	
	
	
	
}
