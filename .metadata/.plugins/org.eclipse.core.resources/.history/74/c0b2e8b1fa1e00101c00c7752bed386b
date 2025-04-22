package ma.isga.depot.service;

import org.springframework.stereotype.Service;

import ma.isga.depot.entities.Catalogue;
import ma.isga.depot.repository.CatalogueRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CatalogueService {

    private  CatalogueRepository catalogueRepository;

    public CatalogueService(CatalogueRepository catalogueRepository) {
		super();
		this.catalogueRepository = catalogueRepository;
	}

	public List<Catalogue> getAllOuvrages() {
        return catalogueRepository.findAll();
    }

    public Optional<Catalogue> getOuvrageById(Long id) {
        return catalogueRepository.findById(id);
    }

    public Optional<Catalogue> getOuvrageByIsbn(String isbn) {
        return catalogueRepository.findByIsbn(isbn);
    }

    public Catalogue saveOuvrage(Catalogue catalogue) {
        return catalogueRepository.save(catalogue);
    }

    public void deleteOuvrage(Long id) {
        catalogueRepository.deleteById(id);
    }
} 