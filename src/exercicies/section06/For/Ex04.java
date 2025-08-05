package exercicies.section06.For;

import java.util.Locale;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args){
        // Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
        // segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double X, Y, result;

        for (int i = 0; i < N; i++) {
            X = sc.nextDouble();
            Y = sc.nextDouble();
            if (Y == 0) {
                System.out.println("divisao impossivel");
            }
            result = X / Y;

            System.out.println(result);
        }

        sc.close();
    }
}

