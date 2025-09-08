package exercicies.section13.Ex03;

import exercicies.section13.Ex03.entities.Circle;
import exercicies.section13.Ex03.entities.Rectangle;
import exercicies.section13.Ex03.entities.Shape;
import exercicies.section13.Ex03.entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("Shape #%d data: \n", i+1);

            System.out.print("Rectangle or Circle (r/c)? ");
            char option = sc.next().charAt(0);

            System.out.print("Color (BLACK/BLUE/RED): ");
            String colorOptionString = sc.next();
            Color colorOption = Color.valueOf(colorOptionString.toUpperCase());

            if (option == 'r') {
                System.out.print("Width: ");
                double width = sc.nextDouble();

                System.out.print("Heigth: ");
                double heigth = sc.nextDouble();

                Shape shape = new Rectangle(colorOption, width, heigth);
                list.add(shape);
            }
            if (option == 'c') {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();

                Shape shape = new Circle(colorOption, radius);
                list.add(shape);
            }
        }

        System.out.println();

        System.out.print("SHAPE AREAS: ");
        for (Shape s : list) {
            System.out.println(s.area());
        }

    }
}
