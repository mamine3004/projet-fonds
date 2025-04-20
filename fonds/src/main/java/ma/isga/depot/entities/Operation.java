package ma.isga.depot.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity

public class Operation {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Long usagerId;
    
    @ManyToOne
    private Catalogue ouvrage;
    
    @Enumerated(EnumType.STRING)
    private TypeOperation type;
    
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private Boolean actif;
    
    public enum TypeOperation {
        EMPRUNT, RESERVATION
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUsagerId() {
		return usagerId;
	}

	public void setUsagerId(Long usagerId) {
		this.usagerId = usagerId;
	}

	public Catalogue getOuvrage() {
		return ouvrage;
	}

	public void setOuvrage(Catalogue ouvrage) {
		this.ouvrage = ouvrage;
	}

	public TypeOperation getType() {
		return type;
	}

	public void setType(TypeOperation type) {
		this.type = type;
	}

	public LocalDate getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(LocalDate dateDebut) {
		this.dateDebut = dateDebut;
	}

	public LocalDate getDateFin() {
		return dateFin;
	}

	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
	}

	public Boolean getActif() {
		return actif;
	}

	public void setActif(Boolean actif) {
		this.actif = actif;
	}

	public Operation(Long usagerId, Catalogue ouvrage, TypeOperation type, LocalDate dateDebut, LocalDate dateFin,
			Boolean actif) {
		super();
		this.usagerId = usagerId;
		this.ouvrage = ouvrage;
		this.type = type;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.actif = actif;
	}

	public Operation() {
		super();
	}
    
    
} 
