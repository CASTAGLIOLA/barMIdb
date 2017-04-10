package fr.icam.barMIdb.entities;

public class Client {

	private int id;
	
	private String nom;
	
	private String prenom;
	
	private String genre;
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String name) {
		this.nom = name;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	
	
	public String toJson() {
		return "{id:" + id + ",nom:" + nom + ","   +",prenom:" + prenom + ",genre:" + genre + "}";
	}
	
}
