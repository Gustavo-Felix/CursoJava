package exercicies.section16;

import exercicies.section16.model.entities.Contract;
import exercicies.section16.model.entities.Installment;
import exercicies.section16.model.service.ContractService;
import exercicies.section16.model.service.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato:");

        System.out.print("Numero: ");
        int number = sc.nextInt();

        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), format);

        System.out.print("Valor do Contrato: ");
        double totalValue = sc.nextDouble();

        System.out.print("Entre com o numero de parcelas: ");
        int months = sc.nextInt();

        Contract contact = new Contract(number, date, totalValue);

        ContractService service = new ContractService(new PaypalService());

        service.processContract(contact, months);

        System.out.println("Parcelas: ");
        for (Installment i : contact.getInstallments()) {
            System.out.println(i);
        }

        sc.close();
    }
}
