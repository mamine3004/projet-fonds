package ma.isga.depot.api;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.isga.depot.entities.Groupe;
import ma.isga.depot.service.IGroupeService;

@RestController
@RequestMapping("/groupes")
public class GroupeController {

    private IGroupeService groupeService;

    public GroupeController(IGroupeService groupeService) {
		this.groupeService = groupeService;
	}

	@GetMapping
    public ResponseEntity<List<Groupe>> getAllGroupes() {
        return ResponseEntity.ok(groupeService.getGroupes());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Groupe> getGroupeById(@PathVariable Long id) {
        return groupeService.getGroupe(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Groupe> createGroupe(@RequestBody Groupe groupe) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(groupeService.saveGroupe(groupe));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Groupe> updateGroupe(@PathVariable Long id, @RequestBody Groupe groupe) {
        return groupeService.getGroupe(id)
                .map(existingGroupe -> {
                    groupe.setId(id);
                    return ResponseEntity.ok(groupeService.saveGroupe(groupe));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGroupe(@PathVariable Long id) {
        groupeService.deleteGroupe(id);
        return ResponseEntity.noContent().build();
    }
	
}
