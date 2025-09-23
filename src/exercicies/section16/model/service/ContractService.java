package exercicies.section16.model.service;

import exercicies.section16.model.entities.Contract;
import exercicies.section16.model.entities.Installment;

import java.time.LocalDate;

public class ContractService{

    private final OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contact, Integer months){
        Double amount = contact.getTotalValue() / months;

        for (int i = 1; i <= months; i++) {
            LocalDate dueDate = contact.getDate().plusMonths(i);
            Double amountMonth = onlinePaymentService.interest(amount, i);
            Installment installment = new Installment(dueDate, onlinePaymentService.paymentFee(amountMonth));
            contact.getInstallments().add(installment);
        }
    }
}
