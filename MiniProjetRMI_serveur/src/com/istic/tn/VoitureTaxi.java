package com.istic.tn;

import java.io.Serializable;

public class VoitureTaxi implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String marque;
	private String couleur;
	private float prix;
	public VoitureTaxi(int id, String marque, String couleur, float prix) {
		super();
		this.id = id;
		this.marque = marque;
		this.couleur = couleur;
		this.prix = prix;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	@Override
	public String toString() {
		return "VoitureTaxi [id=" + id + ", marque=" + marque + ", couleur=" + couleur + ", prix=" + prix + "]";
	}
	
	
	

}
