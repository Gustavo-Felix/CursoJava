package exercicies.section18.Ex02;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        List<Product> products = new ArrayList<>();

        System.out.print("Enter full file path: ");   // src/exercicies/section18/Ex02/in.csv

        String path = sc.next();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();

            while (line != null){
                String name = line.split(",")[0];
                double price = Double.parseDouble(line.split(",")[1]);
                Product product = new Product(name, price);

                products.add(product);

                line = br.readLine();
            }

            double sum = products
                    .stream()
                    .map(Product::getPrice) // Para cada produto pegue o preço
                    .reduce(0.0, Double::sum)
                    / products.toArray().length; // Cada valor Double faça a soma

            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> nameProduct = products
                    .stream()
                    .filter(product -> product.getPrice() < sum)
                    .map(Product::getName)
                    .sorted(comp.reversed())
                    .toList();

            System.out.printf("Average price: %.2f \n", sum);

            nameProduct.forEach(System.out::println);


        } catch (Exception ex) {
            throw new FileNotFoundException(ex.getMessage());
        }

        sc.close();
    }
}
