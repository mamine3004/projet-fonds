package ma.isga.depot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import ma.isga.depot.entities.Groupe;
import ma.isga.depot.repository.GroupeRepository;
@Service
public class GroupeService implements IGroupeService{

    private  GroupeRepository groupeRepository;
    
       

	public GroupeService(GroupeRepository groupeRepository) {
		this.groupeRepository = groupeRepository;
	}

	@Override
	public Groupe saveGroupe(Groupe gr) {
		// TODO Auto-generated method stub
		return groupeRepository.save(gr);
	}

	@Override
	public Optional<Groupe> getGroupe(Long id) {
		// TODO Auto-generated method stub
		return groupeRepository.findById(id);
	}

	@Override
	public List<Groupe> getGroupes() {
		// TODO Auto-generated method stub
		return groupeRepository.findAll();
	}

	@Override
	public void deleteGroupe(Long id) {
		// TODO Auto-generated method stub
		groupeRepository.deleteById(id);
	}

}
