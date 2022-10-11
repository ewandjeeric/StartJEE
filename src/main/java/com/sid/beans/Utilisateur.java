package com.sid.beans;

public class Utilisateur {
	private int id;
	private String nom;
	private String prenom;
	private boolean actif;
	
	
	public Utilisateur(String nom, String prenom, boolean actif) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.actif = actif;
	}
	
	public Utilisateur() {
		super();
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
	public boolean isActif() {
		return actif;
	}
	public void setActif(boolean actif) {
		this.actif = actif;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

}
