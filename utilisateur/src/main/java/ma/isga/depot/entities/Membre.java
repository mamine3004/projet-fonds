package ma.isga.depot.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "membres")
public class Membre {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private long id;


	@ManyToOne(cascade = CascadeType.ALL)
	private Usager usager;
	@ManyToOne(cascade = CascadeType.ALL)
	private Groupe groupe;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Usager getUsager() {
		return usager;
	}
	public void setUsager(Usager usager) {
		this.usager = usager;
	}
	public Groupe getGroupe() {
		return groupe;
	}
	public void setGroupe(Groupe groupe) {
		this.groupe = groupe;
	}
	public Membre(Usager usager, Groupe groupe) {
		super();
		this.usager = usager;
		this.groupe = groupe;
	}
	public Membre() {
		super();
	}
	
}
