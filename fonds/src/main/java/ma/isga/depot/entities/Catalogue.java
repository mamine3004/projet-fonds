package ma.isga.depot.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "catalogue")
public class Catalogue {
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Id
    private String isbn;
    
    private String titre;
    private String auteur;
    private String editeur;
    private String annee;
	public Catalogue(String isbn, String titre, String auteur, String editeur, String annee) {
		super();
		this.isbn = isbn;
		this.titre = titre;
		this.auteur = auteur;
		this.editeur = editeur;
		this.annee = annee;
	}
	public Catalogue() {
		super();
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public String getEditeur() {
		return editeur;
	}
	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}
	public String getAnnee() {
		return annee;
	}
	public void setAnnee(String annee) {
		this.annee = annee;
	}
    
	
    
    
} 