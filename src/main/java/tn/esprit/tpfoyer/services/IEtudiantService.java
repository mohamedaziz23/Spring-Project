package tn.esprit.tpfoyer.services;

import tn.esprit.tpfoyer.entity.Bloc;
import tn.esprit.tpfoyer.entity.Etudiant;

import java.util.List;
import java.util.Optional;

public interface IEtudiantService {
    public List<Etudiant> retrieveAllEtudiants();
    public Optional<Etudiant> retrieveEtudiant(Long etudiantId);
    public Etudiant addEtudiant(Etudiant c);
    public void removeEtudiant(Long etudiantId);
    public Etudiant modifyEtudiant(Etudiant etudiant);
}
