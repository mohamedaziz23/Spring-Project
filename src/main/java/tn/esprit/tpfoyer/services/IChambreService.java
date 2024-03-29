package tn.esprit.tpfoyer.services;

import tn.esprit.tpfoyer.entity.Chambre;

import java.util.List;
import java.util.Optional;

public interface IChambreService {
    public List<Chambre> retrieveAllChambres();
    public Optional<Chambre> retrieveChambre(Long chambreId);
    public Chambre addChambre(Chambre c);
    public void removeChambre(Long chambreId);
    public Chambre modifyChambre(Chambre chambre);
}
