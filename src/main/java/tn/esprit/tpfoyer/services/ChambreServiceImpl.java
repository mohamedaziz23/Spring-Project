package tn.esprit.tpfoyer.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entity.Chambre;
import tn.esprit.tpfoyer.repository.ChambreRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@Slf4j
public class ChambreServiceImpl implements IChambreService{
    ChambreRepository chambreRepository;
    //@Scheduled(fixedDelay = 5000)
    @Override
    public List<Chambre> retrieveAllChambres() {
        List<Chambre> listChambres = chambreRepository.findAll();
        //log.info("nbre de chambre : " + listChambres.size());

        for(Chambre chambre:listChambres){
            //log.info(chambre);
        }

        return listChambres;
    }

    @Override
    public Optional<Chambre> retrieveChambre(Long chambreId) {
        return chambreRepository.findById(chambreId);
    }

    @Override
    public Chambre addChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public void removeChambre(Long chambreId) {
        chambreRepository.deleteById(chambreId);

    }

    @Override
    public Chambre modifyChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }
}
