package tn.esprit.tpfoyer.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entity.Chambre;
import tn.esprit.tpfoyer.services.IChambreService;

import java.util.List;
import java.util.Optional;
@Tag(name = "Gestion Chambre")
@RestController
@AllArgsConstructor
@RequestMapping("/chambre")



public class ChambreRestController {
    IChambreService chambreService;

    @GetMapping("/retrieve-all-chambres")
    @Operation(description = "récupérer toutes les chambres de la base de données")
    public List<Chambre> getChambres() {
        List<Chambre> listChambres = chambreService.retrieveAllChambres();
        return listChambres;
    }

    @GetMapping("/retrieve-chambre/{chambre-id}")

    public Optional<Chambre> retrieveChambre(@PathVariable("chambre-id") Long chId) {
        Optional<Chambre> chambre = chambreService.retrieveChambre(chId);
        return chambre;
    }

    @PostMapping("/add-chambre")

    public Chambre addChambre(@RequestBody Chambre c) {
        Chambre chambre = chambreService.addChambre(c);
        return chambre;
    }

    @DeleteMapping("/remove-chambre/{chambre-id}")
    public void removeChambre(@PathVariable("chambre-id") Long chId) {
        chambreService.removeChambre(chId);
    }
    // http://localhost:8089/tpfoyer/chambre/modify-chambre
    @PutMapping("/modify-chambre")
    public Chambre modifyChambre(@RequestBody Chambre c) {
        Chambre chambre = chambreService.modifyChambre(c);
        return chambre;
    }

}
