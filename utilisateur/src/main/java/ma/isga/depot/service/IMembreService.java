package ma.isga.depot.service;

import java.util.List;
import java.util.Optional;

import ma.isga.depot.entities.Groupe;
import ma.isga.depot.entities.Membre;
import ma.isga.depot.entities.Usager;

public interface IMembreService {


    List<Membre> getAllMembres();
    Optional<Membre> getMembreById(Long id);
    List<Membre> getMembresByUsager(Usager usager);
    List<Membre> getMembresByGroupe(Groupe groupe);
    Membre saveMembre(Membre membre);
    void deleteMembre(Long id);     

}
