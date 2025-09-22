package section16.Resolution;


import section16.Resolution.model.entities.CarRental;
import section16.Resolution.model.entities.Vehicle;
import section16.Resolution.model.service.BrazilTaxService;
import section16.Resolution.model.service.RentalService;

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
            LocalDateTime startDate = LocalDateTime.parse(sc.next(), format);

            System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
            LocalDateTime endDate = LocalDateTime.parse(sc.next(), format);

            CarRental cr = new CarRental(startDate, endDate, new Vehicle(modelCar));

            System.out.print("Entre com o preço por hora: ");
            Double pricePerHour = sc.nextDouble();

            System.out.print("Entre com o preço por dia: ");
            Double pricePerDay = sc.nextDouble();

            RentalService rs = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());

            rs.processInvoice(cr);

            System.out.println("FATURA: ");
            System.out.println("Pagamento básico: " + cr.getInvoice().getBasicPayment());
            System.out.println("Imposto: " + cr.getInvoice().getTax());
            System.out.println("Pagamento total: " + cr.getInvoice().getTotalPayment());

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            sc.close();
        }
    }
}
