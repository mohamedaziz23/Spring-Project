package tn.esprit.tpfoyer.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entity.Bloc;
import tn.esprit.tpfoyer.services.IBlocService;

import java.util.List;
import java.util.Optional;
@Tag(name = "Gestion Bloc")
@RestController
@AllArgsConstructor
@RequestMapping("/bloc")

public class BlocRestController {
    IBlocService blocService;

    @GetMapping("/retrieve-all-blocs")
    public List<Bloc> getBlocs() {
        List<Bloc> listBlocs = blocService.retrieveAllBlocs();
        return listBlocs;
    }

    @GetMapping("/retrieve-bloc/{bloc-id}")
    public Optional<Bloc> retrieveBloc(@PathVariable("bloc-id") Long blocId) {
        Optional<Bloc> Bloc = blocService.retrieveBloc(blocId);
        return Bloc;
    }

    @GetMapping("/retrieve-bloc/{bloc-nom}/{capacite}")
    public Optional<Bloc> retrieveBlocByNom(@PathVariable("bloc-nom") String nomBloc, @PathVariable("capacite") Long capacite) {
        Optional<Bloc> Bloc = blocService.retrieveBlocByNomAndCapacite(nomBloc,capacite);
        return Bloc;
    }

    @PostMapping("/add-bloc")
    public Bloc addBloc(@RequestBody Bloc b) {
        Bloc bloc = blocService.addBloc(b);
        return bloc;
    }

    @DeleteMapping("/remove-bloc/{bloc-id}")
    public void removeBloc(@PathVariable("bloc-id") Long blocId) {
        blocService.removeBloc(blocId);
    }
    // http://localhost:8089/tpfoyer/bloc/modify-bloc
    @PutMapping("/modify-bloc")
    public Bloc modifyBloc(@RequestBody Bloc b) {
        Bloc bloc = blocService.modifyBloc(b);
        return bloc;
    }

}
