package exercicies.section12.Ex03;

import exercicies.section12.Ex03.entities.Client;
import exercicies.section12.Ex03.entities.Order;
import exercicies.section12.Ex03.entities.OrderItem;
import exercicies.section12.Ex03.entities.Product;
import exercicies.section12.Ex03.entities.enums.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        System.out.println("\033[1mEnter client data: \033[0m");
        System.out.print("Name: ");
        String nameClient = sc.next();

        System.out.print("E-mail: ");
        String emailClient = sc.next();

        System.out.print("Birth date (DD/MM/YYYY): ");
        String dateBirthString = sc.next();
        LocalDate dateBirth = LocalDate.parse(dateBirthString, format);

        System.out.println("\033[1mEnter order data: \033[0m");
        System.out.print("Status: ");
        String statusItemString = sc.next();
        OrderStatus statusItem = OrderStatus.valueOf(statusItemString);

        Client client = new Client(nameClient, emailClient, dateBirth);

        Order order = new Order(LocalDateTime.now(), statusItem, client);

        System.out.print("How many items to this order? ");
        int nItems = sc.nextInt();

        for (int i = 0; i < nItems; i++) {
            System.out.printf("\033[1mEnter #%d item data: \033[0m \n", i+1);
            System.out.print("Product Name: ");
            String nameProduct = sc.next();

            System.out.print("Product price: ");
            double priceProduct = sc.nextDouble();

            System.out.print("Quantity:");
            int quantity = sc.nextInt();

            Product product = new Product(nameProduct, priceProduct);
            OrderItem item = new OrderItem(quantity, product.getPrice(), product);
            order.addItem(item);
        }

        System.out.print(order);


    }
}
