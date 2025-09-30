package section17.delimitados;

import section17.delimitados.entities.Product;
import section17.delimitados.services.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        String path = "src/section17/delimitados/in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String product = br.readLine();
            while (product != null) {
                String[] fields = product.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                product = br.readLine();
            }

            System.out.print("Max: " + CalculationService.max(list));

        } catch (IOException e) {
            System.out.print("Error: " + e.getMessage());
        }
    }
}
