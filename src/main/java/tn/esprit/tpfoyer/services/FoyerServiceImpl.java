package tn.esprit.tpfoyer.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entity.Foyer;
import tn.esprit.tpfoyer.repository.FoyerRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class FoyerServiceImpl implements IFoyerService{
    FoyerRepository foyerRepository;

    @Override
    public List<Foyer> retrieveAllFoyers() {
        return foyerRepository.findAll();
    }

    @Override
    public Optional<Foyer> retrieveFoyer(Long foyerId) {
        return foyerRepository.findById(foyerId);
    }

    @Override
    public Foyer addFoyer(Foyer b) {
        return foyerRepository.save(b);
    }

    @Override
    public void removeFoyer(Long FoyerId) {
        foyerRepository.deleteById(FoyerId);

    }

    @Override
    public Foyer modifyFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }
}
