package tn.esprit.tpfoyer.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entity.Bloc;
import tn.esprit.tpfoyer.repository.BlocRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class BlocServiceImpl implements IBlocService{
    BlocRepository blocRepository;

    @Override
    public List<Bloc> retrieveAllBlocs() {
        return blocRepository.findAll();
    }

    @Override
    public Optional<Bloc> retrieveBloc(Long blocId) {
        return blocRepository.findById(blocId);
    }

    @Override
    public Optional<Bloc> retrieveBlocByNomAndCapacite(String nomBloc,Long capacite) {
        return Optional.ofNullable(blocRepository.findByNomBlocAndCapaciteBlocGreaterThan(nomBloc,capacite));

    }

    @Override
    public Bloc addBloc(Bloc b) {
        return blocRepository.save(b);
    }

    @Override
    public void removeBloc(Long BlocId) {
        blocRepository.deleteById(BlocId);

    }

    @Override
    public Bloc modifyBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }
}
