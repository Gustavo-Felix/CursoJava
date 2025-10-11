package section18.funcional.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Application {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        Predicate<Product> pred = product -> product.getPrice() >= 100.0;

        list.removeIf(new ProductPredicate());
        list.removeIf(Product::staticProductPredicate); // Method reference static - Para cada Product, utilize o metodo estatico staticProductPredicate
        list.removeIf(Product::nonstaticProductPredicate); // Method reference non-static - Para cada Product, utilize o metodo estatico staticProductPredicate
        list.removeIf(pred); // Expressão Lambda declarada
        list.removeIf(product -> product.getPrice() >= 100.0); // Expressão Lambda inline

        for (Product p : list) {
            System.out.println(p);
        }

    }
}
