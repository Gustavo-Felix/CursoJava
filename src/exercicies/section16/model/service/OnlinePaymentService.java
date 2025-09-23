package exercicies.section16.model.service;

public interface OnlinePaymentService {
    public Double paymentFee(Double amount);
    public Double interest(Double amount, Integer months);
}
