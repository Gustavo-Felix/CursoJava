package exercicies.section14.Ex01;

import exercicies.section14.Ex01.model.entities.Reservation;
import exercicies.section14.Ex01.model.exceptions.DomainException;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            System.out.print("Room number: ");
            int roomNumber = sc.nextInt();

            System.out.print("Check-in date (dd/MM/yyyy): ");
            String checkInString = sc.next();
            LocalDate checkIn = LocalDate.parse(checkInString, format);

            System.out.print("Check-out date (dd/MM/yyyy): ");
            String checkOutString = sc.next();
            LocalDate checkOut = LocalDate.parse(checkOutString, format);

            Reservation reserversation = new Reservation(roomNumber, checkIn, checkOut);
            System.out.print("Reservation: " + reserversation);

            System.out.println("\nEnter data to update the reservation: ");

            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkInString = sc.next();
            checkIn = LocalDate.parse(checkInString, format);

            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOutString = sc.next();
            checkOut = LocalDate.parse(checkOutString, format);

            reserversation.updateDates(checkIn, checkOut);
            System.out.print("Reservation: " + reserversation);
        } catch (DomainException e) {
            System.out.print("Error in reservation: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.print("Unexpected error!");
        }

        sc.close();
    }
}
