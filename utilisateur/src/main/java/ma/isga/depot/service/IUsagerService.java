package ma.isga.depot.service;

import java.util.List;
import java.util.Optional;

import ma.isga.depot.entities.Usager;

public interface IUsagerService {
	
    List<Usager> getAllUsagers();
    Optional<Usager> getUsagerById(Long id);
    Optional<Usager> getUsagerByLogin(String login);
    Usager saveUsager(Usager usager);
    void deleteUsager(Long id);
    boolean authenticate(String login, String password);

}
