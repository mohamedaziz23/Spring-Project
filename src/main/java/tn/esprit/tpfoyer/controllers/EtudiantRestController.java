package tn.esprit.tpfoyer.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entity.Etudiant;
import tn.esprit.tpfoyer.services.IEtudiantService;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/etudiant")

public class EtudiantRestController {
    IEtudiantService etudiantService;

    @GetMapping("/retrieve-all-etudiants")
    public List<Etudiant> getEtudiants() {
        List<Etudiant> listEtudiants = etudiantService.retrieveAllEtudiants();
        return listEtudiants;
    }

    @GetMapping("/retrieve-etudiant/{etudiant-id}")
    public Optional<Etudiant> retrieveEtudiant(@PathVariable("etudiant-id") Long etudiantId) {
        Optional<Etudiant> Etudiant = etudiantService.retrieveEtudiant(etudiantId);
        return Etudiant;
    }

    @PostMapping("/add-etudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant b) {
        Etudiant etudiant = etudiantService.addEtudiant(b);
        return etudiant;
    }

    @DeleteMapping("/remove-etudiant/{etudiant-id}")
    public void removeEtudiant(@PathVariable("etudiant-id") Long etudiantId) {
        etudiantService.removeEtudiant(etudiantId);
    }
    // http://localhost:8089/tpfoyer/etudiant/modify-etudiant
    @PutMapping("/modify-etudiant")
    public Etudiant modifyEtudiant(@RequestBody Etudiant b) {
        Etudiant etudiant = etudiantService.modifyEtudiant(b);
        return etudiant;
    }

}
