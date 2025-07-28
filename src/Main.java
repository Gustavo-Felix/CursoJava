import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        String nome = "Gustavo";
        int idade = 18;
        double renda = 1000.00;
        int x = 32;
        double y = 10.35784; // Pode ser usado o float também, mas o double é mais preciso

        System.out.println("Hello World!");
        System.out.println(x);
        System.out.println(y);
        System.out.printf("%.2f%n", y); // printf - print Formatado com 2 dígitos depois da vírgula. Quanto menos dígitos, mais arredondado fica o número
        System.out.printf("%.4f%n", y); // printf - print Formatado com 4 dígitos depois da vírgula.
        System.out.printf("RESULTADO = %.2f metros%n", y); // %f = ponto flutuante  -  %n = quebra de linha
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda); // %d = inteiro  -  %s = texto
    }
}