package exercicies.section12.Ex03.entities;

import exercicies.section12.Ex03.entities.enums.OrderStatus;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {
    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    private LocalDateTime moment;
    private OrderStatus status;

    private final List<OrderItem> items = new ArrayList<>();
    private Client client = new Client();

    public Order() {
    }

    public Order(LocalDateTime moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public Double total() {
        Double totalItems = 0.0;
        for (OrderItem item : items) {
            totalItems += item.subTotal();
        }
        return totalItems;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMMARY: \n");
        sb.append("Order moment: " + moment.format(format) + "\n");
        sb.append("Order status: " + status.toString() + "\n");
        sb.append("Client: " + client + "\n");

        sb.append("Order items: " + "\n");

        for (OrderItem i : items) {
            sb.append(i.getProduct().getName() + ", $" + i.getPrice() + ", Quantity: " + i.getQuantity() + ", SubTotal: $" + i.subTotal() + "\n");
        }
        sb.append("Total Price: $" + total());

        return sb.toString();
    }
}
