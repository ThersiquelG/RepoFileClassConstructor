
public class Employes {
 String nom;
 String prenom;
 String numerosocial;
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
public String getNumerosocial() {
	return numerosocial;
}
public void setNumerosocial(String numerosocial) {
	this.numerosocial = numerosocial;
}

//constructor using field.
public Employes(String nom, String prenom) {
	super();
	this.nom = nom;
	this.prenom = prenom;
}
 
}
