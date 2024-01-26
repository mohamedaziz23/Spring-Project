package tn.esprit.tpfoyer.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entity.Etudiant;
import tn.esprit.tpfoyer.repository.EtudiantRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class EtudiantServiceImpl implements IEtudiantService{
    EtudiantRepository etudiantRepository;

    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return etudiantRepository.findAll();
    }

    @Override
    public Optional<Etudiant> retrieveEtudiant(Long etudiantId) {
        return etudiantRepository.findById(etudiantId);
    }

    @Override
    public Etudiant addEtudiant(Etudiant b) {
        return etudiantRepository.save(b);
    }

    @Override
    public void removeEtudiant(Long EtudiantId) {
        etudiantRepository.deleteById(EtudiantId);

    }

    @Override
    public Etudiant modifyEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }
}
