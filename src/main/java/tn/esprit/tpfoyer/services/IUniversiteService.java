package tn.esprit.tpfoyer.services;

import tn.esprit.tpfoyer.entity.Universite;

import java.util.List;
import java.util.Optional;

public interface IUniversiteService {
    public List<Universite> retrieveAllUniversites();
    public Optional<Universite> retrieveUniversite(Long universiteId);
    public Universite addUniversite(Universite c);
    public void removeUniversite(Long universiteId);
    public Universite modifyUniversite(Universite universite);
}
