package section16.Resolution.model.service;

import section16.Resolution.model.entities.CarRental;
import section16.Resolution.model.entities.Invoice;

import java.time.Duration;

public class RentalService {
    private Double pricePerHour;
    private Double pricePerDay;

    private BrazilTaxService taxService;

    public RentalService(Double pricePerHour, Double pricePerDay, BrazilTaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental cr){
        double minutes = Duration.between(cr.getStart(), cr.getEnd()).toMinutes();
        double hours = minutes / 60.0;

        double basicPayment;

        if (hours <= 12.0){
            basicPayment = pricePerHour * Math.ceil(hours);
        }
        else {
            basicPayment = pricePerDay * Math.ceil(hours/24);
        }

        double tax = taxService.tax(basicPayment);

        cr.setInvoice(new Invoice(basicPayment, tax));
    }
}
