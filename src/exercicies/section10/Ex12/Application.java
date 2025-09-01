package exercicies.section10.Ex12;

import exercicies.section10.Ex12.entities.Rent;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        String name, email;
        int room;
        Rent[] vect = new Rent[10];

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("Rent #%d: \n", i+1);
            System.out.print("Name: ");
            name = sc.next();
            System.out.print("Email: ");
            email = sc.next();
            System.out.print("Room: ");
            room = sc.nextInt();
            vect[room] = new Rent(name, email);
        }

        System.out.println("Busy rooms: ");
        for (int i = 0; i < n; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }

        sc.close();
    }
}
