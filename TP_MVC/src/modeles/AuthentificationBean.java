package modeles;

public class AuthentificationBean {
private String nom;
private String prenom;

public AuthentificationBean(String nom, String prenom){
	this.nom=nom;
	this.prenom=prenom;

	
}
public AuthentificationBean(){
	setNom("");
	setPrenom("");
}
public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public String getPrenom() {
	return prenom;
}

public void setPrenom(String prenom) {
	this.prenom = prenom;
}
}