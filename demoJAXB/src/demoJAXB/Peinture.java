package demoJAXB;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="pintura")
@XmlType(propOrder={"gamme", "couleur"})
public class Peinture implements Serializable{
	
	private String nom;
	private String couleur;
	private String gamme;
	private String remplissage;
	
	public Peinture(String nom, String couleur, String gamme, String remplissage) {
		super();
		this.nom = nom;
		this.couleur = couleur;
		this.gamme = gamme;
		this.remplissage = remplissage;
	}

	public Peinture() {
		super();
	}

	@XmlAttribute(name="label")
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	//@XmlElement par défaut
	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	@XmlElement(name="catégorie")
	public String getGamme() {
		return gamme;
	}

	public void setGamme(String gamme) {
		this.gamme = gamme;
	}

	@XmlTransient
	public String getRemplissage() {
		return remplissage;
	}

	public void setRemplissage(String remplissage) {
		this.remplissage = remplissage;
	}
	
	
	
}
