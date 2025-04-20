package ma.isga.depot.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.isga.depot.entities.Usager;

public interface UsagerRepository extends JpaRepository<Usager, Long> {
    Optional<Usager> findByLogin(String login);
    Optional<Usager> findByLoginAndPassword(String login,String password);

}
