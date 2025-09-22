package section16.Ex01.entities;

import java.time.Duration;
import java.time.LocalDateTime;

public class Rental {
    private String modelCar;
    private LocalDateTime pickup;
    private LocalDateTime returnOfCar;
    private Double pricePerHour;
    private Double pricePerDay;

    public Rental() {
    }

    public Rental(String modelCar, LocalDateTime pickup, LocalDateTime returnOfCar, Double pricePerHour, Double pricePerDay) {
        this.modelCar = modelCar;
        this.pickup = pickup;
        this.returnOfCar = returnOfCar;
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public LocalDateTime getPickup() {
        return pickup;
    }

    public void setPickup(LocalDateTime pickup) {
        this.pickup = pickup;
    }

    public LocalDateTime getReturnOfCar() {
        return returnOfCar;
    }

    public void setReturnOfCar(LocalDateTime returnOfCar) {
        this.returnOfCar = returnOfCar;
    }

    public Double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(Double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public Double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(Double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public Long duration() {
        Duration duration = Duration.between(pickup, returnOfCar);
        return duration.toHours() + 1;
    }

    public Double basicPayment(){
        if (duration() > 12) {
            return ((duration() % 24) + 1) * pricePerDay;
        } else {
            return duration() * pricePerHour;
        }
    }

    public Double tax(){
        if (duration() > 12) {
            return basicPayment() * 0.15;
        } else {
            return basicPayment() * 0.2;
        }
    }

    public Double totalPayment(){
        return basicPayment() + tax();
    }

    public void processInvoice(){
        System.out.println("FATURA: ");
        System.out.println("Pagamento básico: " + basicPayment());
        System.out.println("Imposto: " + tax());
        System.out.println("Pagamento total: " + totalPayment());
    }

}
