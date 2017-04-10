package fr.icam.barMIdb.entities;

public class Produit {

	private int id;
	
	private String nom;
	private float deg;
	
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public float getDeg() {
		return deg;
	}

	public void setDeg(float deg) {
		this.deg = deg;
	}
	public Produit (int id, String nom, float deg)
	{this.id=id;
	this.nom=nom;
	this.deg=deg;}
	
	public Produit ()
	{}
	
	public String toJson() {
		return "{id:" + id + ",nom:" +nom+ ",deg:" +deg+"}";
	}
	
}
