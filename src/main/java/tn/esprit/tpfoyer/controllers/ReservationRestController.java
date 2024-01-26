package tn.esprit.tpfoyer.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.entity.Reservation;
import tn.esprit.tpfoyer.services.IReservationService;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/reservation")

public class ReservationRestController {
    IReservationService reservationService;

    @GetMapping("/retrieve-all-reservations")
    public List<Reservation> getReservations() {
        List<Reservation> listReservations = reservationService.retrieveAllReservations();
        return listReservations;
    }

    @GetMapping("/retrieve-reservation/{reservation-id}")
    public Optional<Reservation> retrieveReservation(@PathVariable("reservation-id") String reservationId) {
        Optional<Reservation> Reservation = reservationService.retrieveReservation(reservationId);
        return Reservation;
    }

    @PostMapping("/add-reservation")
    public Reservation addReservation(@RequestBody Reservation b) {
        Reservation reservation = reservationService.addReservation(b);
        return reservation;
    }

    @DeleteMapping("/remove-reservation/{reservation-id}")
    public void removeReservation(@PathVariable("reservation-id") String reservationId) {
        reservationService.removeReservation(reservationId);
    }
    // http://localhost:8089/tpfoyer/reservation/modify-reservation
    @PutMapping("/modify-reservation")
    public Reservation modifyReservation(@RequestBody Reservation b) {
        Reservation reservation = reservationService.modifyReservation(b);
        return reservation;
    }

}
