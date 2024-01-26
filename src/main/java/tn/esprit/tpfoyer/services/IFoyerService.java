package tn.esprit.tpfoyer.services;

import tn.esprit.tpfoyer.entity.Foyer;

import java.util.List;
import java.util.Optional;

public interface IFoyerService {
    public List<Foyer> retrieveAllFoyers();
    public Optional<Foyer> retrieveFoyer(Long foyerId);
    public Foyer addFoyer(Foyer c);
    public void removeFoyer(Long foyerId);
    public Foyer modifyFoyer(Foyer foyer);
}
