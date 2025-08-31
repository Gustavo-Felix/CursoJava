package section10;

import section10.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class VectorsPT2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Product[] vect = new Product[n];
        double result = 0.0, avg;

        for (int i=0; i<n; i++) {
            sc.nextInt();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
            result += vect[i].getPrice();
        }

        avg = result / n;

        System.out.printf("AVARAGE PRICE = %.2f%n", avg);

        sc.close();
    }
}
