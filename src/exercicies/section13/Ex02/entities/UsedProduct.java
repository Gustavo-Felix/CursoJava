package exercicies.section13.Ex02.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product{
    private LocalDate manufactureDate;

    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");


    public UsedProduct() {
        super();
    }

    public UsedProduct(String name, Double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag() {
        return " (used)" + super.priceTag() + " (Manufacture date: " + manufactureDate.format(format) + ")";
    }
}
