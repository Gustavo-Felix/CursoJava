package section18.funcional.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Application {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        Consumer<Product> cons = product -> product.setPrice(product.getPrice() * 1.1);


        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        list.forEach(new PriceUpdate()); // Implementação da interface
        list.forEach(Product::staticPriceUpdate); // Reference Method
        list.forEach(Product::nonstaticPriceUpdate); // Reference Method - non-static
        list.forEach(cons); // Lambda Declarada
        list.forEach(product -> product.setPrice(product.getPrice() * 1.1)); // Lambda inline


        list.forEach(System.out::println);
    }
}
