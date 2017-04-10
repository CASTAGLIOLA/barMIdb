package fr.icam.barMIdb.entities;
import java.sql.*;

public class Commande {

	private int id;
	
	private Client client;
	private Article article;
	private float nbre;
	private long hr;
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}
	
	public float getNbre() {
		return nbre;
	}

	public void setNbre(float nbre) {
		this.nbre = nbre;
	}	
	public long getHr() {
		return hr;
	}

	public void setHr(long hr) {
		this.hr = hr;
	}
	


	
	public String toJson() {
		return "{id:" + id + ",Nom du client:" + client.toJson()  + ",article:" + article.toJson() + "quantité:" + nbre+ ",Horodatage :" + hr + "}";
	}
	
}