package tn.esprit.tpfoyer.services;

import tn.esprit.tpfoyer.entity.Bloc;

import java.util.List;
import java.util.Optional;

public interface IBlocService {
    public List<Bloc> retrieveAllBlocs();
    public Optional<Bloc> retrieveBloc(Long blocId);
    public Bloc addBloc(Bloc c);
    public void removeBloc(Long blocId);
    public Bloc modifyBloc(Bloc bloc);
}
