package exercicies.section14.Ex01.model.entities;

import exercicies.section14.Ex01.model.exceptions.DomainException;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reservation {
    private Integer roomNumber;
    private LocalDate checkin;
    private LocalDate checkout;

    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Reservation() {
    }

    public Reservation(Integer roomNumber, LocalDate checkin, LocalDate checkout) throws DomainException {
        if (!checkout.isAfter(checkin)) {
            throw new DomainException("Check-out date must be after check-in date\n");
        }
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public LocalDate getCheckin() {
        return checkin;
    }

    public LocalDate getCheckout() {
        return checkout;
    }

    public Long duration() {
        Duration duration = Duration.between(checkin.atStartOfDay(), checkout.atStartOfDay());
        return duration.toDays();
    }

    public void updateDates(LocalDate checkin, LocalDate checkout) throws DomainException { // The method can throws a DomainException
        if (checkin.isBefore(LocalDate.now()) || checkout.isBefore(LocalDate.now())) {
            throw new DomainException("Reservation dates for update must be future dates\n");
        }
        if (!checkout.isAfter(checkin)) {
            throw new DomainException("Check-out date must be after check-in date\n");
        }
        this.checkin = checkin;
        this.checkout = checkout;
    }

    @Override
    public String toString() {
        return "Reservation: Room " + roomNumber + ", check-in: " + format.format(checkin) + ", check-out: " + format.format(checkout) + ", " + duration() + " nights";
    }
}
