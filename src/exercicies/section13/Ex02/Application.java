package exercicies.section13.Ex02;

import exercicies.section13.Ex02.entities.ImportedProduct;
import exercicies.section13.Ex02.entities.Product;
import exercicies.section13.Ex02.entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        List<Product> products = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("Product #%d data:\n", i+1);

            System.out.print("Common, used or imported (c/u/i)? ");
            char option = sc.next().charAt(0);

            System.out.print("Name: ");
            String name  = sc.next();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            if (option == 'c') {
                Product product = new Product(name, price);
                products.add(product);
            }
            if (option == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String dateString = sc.next();
                LocalDate date = LocalDate.parse(dateString, format);
                Product product = new UsedProduct(name, price, date);
                products.add(product);
            }
            if (option == 'i') {
                System.out.print("Customs fee: ");
                double customFee = sc.nextDouble();
                Product product = new ImportedProduct(name, price, customFee);
                products.add(product);
            }
        }

        System.out.println("PRICE TAGS:");
        for (Product p : products) {
            System.out.print(p.getName() + p.priceTag() + "\n");
        }
    }
}
