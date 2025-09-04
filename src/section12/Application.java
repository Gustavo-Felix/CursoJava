package section12;

import section12.entities.Order;
import section12.entities.enums.OrderStatus;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        Order order1 = new Order(1080, LocalDate.now(), OrderStatus.PENDING_PAYMENT);
        Order order2 = new Order(1080, LocalDate.now(), OrderStatus.valueOf("DELIVERED"));

        System.out.println(order1);
        System.out.println(order2);

    }
}
