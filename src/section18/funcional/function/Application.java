package section18.funcional.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Application {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        Function<Product, String> func = product -> product.getName().toUpperCase();

        List<String> names = list.stream().map(new ProductUpperName()).toList();
        List<String> names1 = list.stream().map(Product::staticUpperName).toList();
        List<String> names2 = list.stream().map(Product::nonstaticUpperName).toList();
        List<String> names3 = list.stream().map(func).toList();
        List<String> names4 = list.stream().map(product -> product.getName().toUpperCase()).toList();

        names.forEach(System.out::println);
        System.out.println();
        names1.forEach(System.out::println);
        System.out.println();
        names2.forEach(System.out::println);
        System.out.println();
        names3.forEach(System.out::println);
        System.out.println();
        names4.forEach(System.out::println);
    }
}
