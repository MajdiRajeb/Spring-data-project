package tn.enig.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Magasin {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	private String nom,lieu;
	public Magasin(Integer id, String nom, String lieu) {
		super();
		Id = id;
		this.nom = nom;
		this.lieu = lieu;
	}
	public Magasin() {
		super();
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getLieu() {
		return lieu;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	
	
	

}
