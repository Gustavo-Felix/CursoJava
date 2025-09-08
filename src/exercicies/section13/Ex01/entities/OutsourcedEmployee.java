package exercicies.section13.Ex01.entities;

public class OutsourcedEmployee extends Employee {

    private Double addicionalCharge;

    public OutsourcedEmployee() {
        super();
    }

    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double addicionalCharge) {
        super(name, hours, valuePerHour);
        this.addicionalCharge = addicionalCharge;
    }

    @Override
    public Double payment() {
        return super.payment() + addicionalCharge + (addicionalCharge * 0.1);
    }
}
