package section10;

import java.util.Locale;
import java.util.Scanner;

public class Vectors {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vect = new double[n]; // Criado Vetor com tamanho n
        double result = 0.0, avg;

        for (int i=0; i<n; i++){
            vect[i] = sc.nextDouble();
            result += vect[i];
        }

        avg = result / n;

        System.out.printf("AVARAGE HEIGHT = %.2f%n", avg);

        sc.close();
    }
}
