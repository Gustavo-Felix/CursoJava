package exercicies.section06.For;

import java.util.Locale;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args){
        // Ler um número inteiro N e calcular todos os seus divisores.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i <= N; i++){
            if(N % i == 0){
                System.out.println(i);
            }
        }
    }
}
