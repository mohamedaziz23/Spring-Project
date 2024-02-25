package tn.esprit.tpfoyer.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entity.Foyer;
import tn.esprit.tpfoyer.services.IFoyerService;

import java.util.List;
import java.util.Optional;
@Tag(name = "Gestion Foyer")
@RestController
@AllArgsConstructor
@RequestMapping("/foyer")

public class FoyerRestController {
    IFoyerService foyerService;

    @GetMapping("/retrieve-all-foyers")
    public List<Foyer> getFoyers() {
        List<Foyer> listFoyers = foyerService.retrieveAllFoyers();
        return listFoyers;
    }

    @GetMapping("/retrieve-foyer/{foyer-id}")
    public Optional<Foyer> retrieveFoyer(@PathVariable("foyer-id") Long foyerId) {
        Optional<Foyer> Foyer = foyerService.retrieveFoyer(foyerId);
        return Foyer;
    }

    @PostMapping("/add-foyer")
    public Foyer addFoyer(@RequestBody Foyer b) {
        Foyer foyer = foyerService.addFoyer(b);
        return foyer;
    }

    @DeleteMapping("/remove-foyer/{foyer-id}")
    public void removeFoyer(@PathVariable("foyer-id") Long foyerId) {
        foyerService.removeFoyer(foyerId);
    }
    // http://localhost:8089/tpfoyer/foyer/modify-foyer
    @PutMapping("/modify-foyer")
    public Foyer modifyFoyer(@RequestBody Foyer b) {
        Foyer foyer = foyerService.modifyFoyer(b);
        return foyer;
    }

}
