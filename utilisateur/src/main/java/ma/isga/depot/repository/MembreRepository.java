package ma.isga.depot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.isga.depot.entities.Groupe;
import ma.isga.depot.entities.Membre;
import ma.isga.depot.entities.Usager;

import java.util.List;


public interface MembreRepository extends JpaRepository<Membre, Long> {
		List<Membre> findByUsager(Usager usager);
		List<Membre> findByGroupe(Groupe groupe);
}
