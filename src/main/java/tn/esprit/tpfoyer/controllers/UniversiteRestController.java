package tn.esprit.tpfoyer.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entity.Universite;
import tn.esprit.tpfoyer.services.IUniversiteService;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/universite")

public class UniversiteRestController {
    IUniversiteService universiteService;

    @GetMapping("/retrieve-all-universites")
    public List<Universite> getUniversites() {
        List<Universite> listUniversites = universiteService.retrieveAllUniversites();
        return listUniversites;
    }

    @GetMapping("/retrieve-universite/{universite-id}")
    public Optional<Universite> retrieveUniversite(@PathVariable("universite-id") Long universiteId) {
        Optional<Universite> Universite = universiteService.retrieveUniversite(universiteId);
        return Universite;
    }

    @PostMapping("/add-universite")
    public Universite addUniversite(@RequestBody Universite b) {
        Universite universite = universiteService.addUniversite(b);
        return universite;
    }

    @DeleteMapping("/remove-universite/{universite-id}")
    public void removeUniversite(@PathVariable("universite-id") Long universiteId) {
        universiteService.removeUniversite(universiteId);
    }
    // http://localhost:8089/tpfoyer/universite/modify-universite
    @PutMapping("/modify-universite")
    public Universite modifyUniversite(@RequestBody Universite b) {
        Universite universite = universiteService.modifyUniversite(b);
        return universite;
    }

}
