package ma.isga.depot.service;

import java.util.List;
import java.util.Optional;

import ma.isga.depot.entities.Groupe;

public interface IGroupeService {
	Groupe saveGroupe(Groupe gr);
	Optional<Groupe> getGroupe(Long id);
	List<Groupe>  getGroupes();
	void deleteGroupe(Long id);


}
