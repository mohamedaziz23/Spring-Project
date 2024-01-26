package tn.esprit.tpfoyer.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entity.Universite;
import tn.esprit.tpfoyer.repository.UniversiteRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UniversiteServiceImpl implements IUniversiteService{
    UniversiteRepository universiteRepository;

    @Override
    public List<Universite> retrieveAllUniversites() {
        return universiteRepository.findAll();
    }

    @Override
    public Optional<Universite> retrieveUniversite(Long universiteId) {
        return universiteRepository.findById(universiteId);
    }

    @Override
    public Universite addUniversite(Universite b) {
        return universiteRepository.save(b);
    }

    @Override
    public void removeUniversite(Long UniversiteId) {
        universiteRepository.deleteById(UniversiteId);

    }

    @Override
    public Universite modifyUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }
}
