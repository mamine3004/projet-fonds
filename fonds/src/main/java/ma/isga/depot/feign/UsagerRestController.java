package ma.isga.depot.feign;

import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import ma.isga.depot.entities.Usager;


@FeignClient(name="UTILISATEUR")
public interface UsagerRestController {

	@GetMapping("/usagers/{id}")
	Optional<Usager> getUsager(@PathVariable Long id);

}
