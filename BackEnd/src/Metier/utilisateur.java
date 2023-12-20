package Metier;

public class utilisateur {
	private String login;
	private String password;
	private float montant;


	public utilisateur(String login, String password,float montant) {
		super();
		this.login = login;
		this.password = password;
		this.montant=montant;
	}
	public utilisateur() {
	}


	public String getLogin() {
		return login;
	}
	

	public float getMontant() {
		return montant;
	}
	public void setMontant(float montant) {
		this.montant = montant;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean verif() {
		if ((this.login.equals("admin")) && (this.password.equals("admin"))){
			return true;
			
		}else {
			return false;
		}
	}

}
