package section16.Ex01;

import section16.Ex01.entities.Rental;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        try {
            System.out.println("Entre com os dados do aluguel: ");

            System.out.print("Modelo do carro: ");
            String modelCar = sc.next();

            System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
            String strPickupDate = sc.next();
            LocalDateTime pickupDate = LocalDateTime.parse(strPickupDate, format);

            System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
            String strReturnDate = sc.next();
            LocalDateTime returnDate = LocalDateTime.parse(strReturnDate, format);

            System.out.print("Entre com o preço por hora: ");
            Double pricePerHour = sc.nextDouble();

            System.out.print("Entre com o preço por dia: ");
            Double pricePerDay = sc.nextDouble();

            Rental rental = new Rental(modelCar, pickupDate, returnDate, pricePerHour, pricePerDay);

            rental.processInvoice();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
