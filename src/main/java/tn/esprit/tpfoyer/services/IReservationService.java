package tn.esprit.tpfoyer.services;

import tn.esprit.tpfoyer.entity.Reservation;

import java.util.List;
import java.util.Optional;

public interface IReservationService {
    public List<Reservation> retrieveAllReservations();
    public Optional<Reservation> retrieveReservation(String reservationId);
    public Reservation addReservation(Reservation c);
    public void removeReservation(String reservationId);
    public Reservation modifyReservation(Reservation reservation);
}
