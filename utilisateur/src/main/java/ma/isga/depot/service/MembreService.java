package ma.isga.depot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import ma.isga.depot.entities.Groupe;
import ma.isga.depot.entities.Membre;
import ma.isga.depot.entities.Usager;
import ma.isga.depot.repository.MembreRepository;
@Service
public class MembreService implements IMembreService{

	private  MembreRepository membreRepository;
	
	
	public MembreService(MembreRepository membreRepository) {
		this.membreRepository = membreRepository;
	}

	@Override
	public List<Membre> getAllMembres() {
		// TODO Auto-generated method stub
		return membreRepository.findAll();
	}

	@Override
	public Optional<Membre> getMembreById(Long id) {
		// TODO Auto-generated method stub
		return membreRepository.findById(id);
	}

	@Override
	public List<Membre> getMembresByUsager(Usager usager) {
		// TODO Auto-generated method stub
		return membreRepository.findByUsager(usager);
	}

	@Override
	public List<Membre> getMembresByGroupe(Groupe groupe) {
		// TODO Auto-generated method stub
		return membreRepository.findByGroupe(groupe);
	}

	@Override
	public Membre saveMembre(Membre membre) {
		// TODO Auto-generated method stub
		return membreRepository.save(membre);
	}

	@Override
	public void deleteMembre(Long id) {
		// TODO Auto-generated method stub
		membreRepository.deleteById(id);
	}

}
