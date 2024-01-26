package tn.esprit.tpfoyer.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entity.Reservation;
import tn.esprit.tpfoyer.repository.ReservationRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ReservationServiceImpl implements IReservationService{
    ReservationRepository reservationRepository;

    @Override
    public List<Reservation> retrieveAllReservations() {
        return reservationRepository.findAll();
    }

    @Override
    public Optional<Reservation> retrieveReservation(String reservationId) {
        return reservationRepository.findById(reservationId);
    }

    @Override
    public Reservation addReservation(Reservation b) {
        return reservationRepository.save(b);
    }

    @Override
    public void removeReservation(String ReservationId) {
        reservationRepository.deleteById(ReservationId);

    }

    @Override
    public Reservation modifyReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }
}
