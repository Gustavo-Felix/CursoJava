import java.util.Locale;
import java.util.Scanner;

public class DataEntry {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int age = sc.nextInt();
        double x = sc.nextDouble();
        char word = sc.next().charAt(0); // Função charAt(), pega apenas a quantidade de letras que foi digitado - EX: charAt(0) - Word - mostra apenas o W no terminal.

        System.out.println(name);
        System.out.println(age);
        System.out.printf("O número que você digitou é: %.2f", x);
        System.out.println(word);

        int y;
        String s1, s2, s3;
        y = sc.nextInt();
        sc.nextLine();
        s1 = sc.nextLine(); // Pode ser usado até para absorver a quebra de linha.
        s2 = sc.nextLine();
        s3 = sc.nextLine();
        System.out.println("DADOS DIGITADOS:");
        System.out.println(y);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();
    }
}
