package ma.isga.depot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.isga.depot.entities.Catalogue;
import ma.isga.depot.entities.Fond;

import java.util.Optional;

@Repository
public interface FondRepository extends JpaRepository<Fond, Long> {
    Optional<Fond> findByOuvrage(Catalogue ouvrage);
} 