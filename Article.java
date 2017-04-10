package fr.icam.barMIdb.entities;
/* Fichier Article.java */
public class Article {

	private int id;
	
	private Type type;
	private Produit  produit;
	private int qt;
	private float prix;
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}
	
	public int getQt() {
		return qt;
	}

	public void setQt(int qt) {
		this.qt = qt;
	}	
	
	

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}
	
	public String toJson() {
		return "{id:" + id + ",type:" + type.toJson()  + ",produit:" + produit.toJson() + "quantité:" + qt+ ",prix :" + prix + "}";
	}
	
}
