package exercicies.section08.Class.Ex01;

import exercicies.section08.Class.Ex01.entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args){
        // Fazer um programa para ler os valores da largura e altura
        // de um retângulo. Em seguida, mostrar na tela o valor de
        // sua área, perímetro e diagonal. Usar uma classe como
        // mostrado no projeto ao lado.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
        rectangle.Width = sc.nextDouble();
        rectangle.Height = sc.nextDouble();
        System.out.println("AREA = " + rectangle.Area());
        System.out.println("PERIMETER = " + rectangle.Perimeter());
        System.out.println("DIAGONAL = " + rectangle.Diagonal());

        sc.close();
    }
}
